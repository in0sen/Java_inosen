package Course58;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.ToolProvider;

public class JavaMaker {
	public void javaCodeStart(String javaCode) {

		// Javaコードをバイトコードにコンパイル
		byte[] byteCode = compileJavaCode(javaCode);

		// バイトコードを使ってクラスを定義
		Class<?> clazz = defineClass("HelloWorld", byteCode);

		// メインメソッドを実行
		try {
			Method mainMethod = clazz.getMethod("main", String[].class);
			mainMethod.invoke(null, (Object) new String[] {});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Javaコードをバイトコードにコンパイル
	private static byte[] compileJavaCode(String javaCode) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
		StringWriter writer = new StringWriter();

		// メモリ内にソースコードを保持するJavaFileObjectを作成
		JavaFileObject fileObject = new SimpleJavaFileObject(URI.create("string:///"
				+ "HelloWorld.java"), JavaFileObject.Kind.SOURCE) {
			@Override
			public CharSequence getCharContent(boolean ignoreEncodingErrors) {
				return javaCode;
			}
		};

		// コンパイルオプションとバイナリ出力先を設定
		String[] compileOptions = new String[] { "-d", "./bin" };
		Iterable<String> compilationOptions = Arrays.asList(compileOptions);
		JavaCompiler.CompilationTask task = compiler.getTask(writer, null, diagnostics, compilationOptions, null,
				Arrays.asList(fileObject));

		// コンパイル実行
		boolean success = task.call();
		if (!success) {
			System.out.println("コンパイルエラー:");
			for (Diagnostic<?> diagnostic : diagnostics.getDiagnostics()) {
				System.out.println(diagnostic.toString());
			}
			return null;
		}

		// コンパイルされたクラスファイルを読み込む
		try {
			File classFile = new File("./bin/HelloWorld.class");
			FileInputStream fileInputStream = new FileInputStream(classFile);
			byte[] buffer = new byte[(int) classFile.length()];
			fileInputStream.read(buffer);
			fileInputStream.close();
			return buffer;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	// カスタムのクラスローダー
	static class CustomClassLoader extends ClassLoader {
		public Class<?> defineClass(String name, byte[] byteCode) {
			return super.defineClass(name, byteCode, 0, byteCode.length);
		}
	}

	// バイトコードを使ってクラスを定義
	private static Class<?> defineClass(String name, byte[] byteCode) {
		return new CustomClassLoader().defineClass(name, byteCode);
	}
}
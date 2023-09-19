package Course58;

public class Practice03 {
	public static void main(String[] args) {
		JavaMaker jm = new JavaMaker();
		String startCode = "import java.util.*;public class HelloWorld { public static void main(String[] args){"
				+ "Random ra=new Random();"
				+ "for(int a=0; a<10; a++){ System.out.println(ra.nextInt(1000));}"
				+ ""
				+ "}}";
		jm.javaCodeStart(startCode);
	}
}
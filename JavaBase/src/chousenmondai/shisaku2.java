package chousenmondai;

import java.util.Scanner;

public class shisaku2 {
	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("あなたが思い浮かべている人を当てます");
	System.out.println("数字を打ち込んでください！");
	
	System.out.println("性別は男性？女性？");
	System.out.println("男性＝１　女性＝２");
	int a = stdIn.nextInt();
	
	System.out.println("職業は営業職？エンジニア？");
	System.out.println("営業職＝１　エンジニア＝２");
	int b = stdIn.nextInt();
	
	System.out.println("魚は好き？嫌いなら肉は好き？");
	System.out.println("魚が好き＝１　魚は嫌いだが肉は好き＝２　両方嫌い＝３");
	int c = stdIn.nextInt();
	
	
	System.out.println("夏と冬どっちが好き？");
	System.out.println("夏＝１　冬＝２");
	int d = stdIn.nextInt();
	
	System.out.println("猫と犬どっちが好き？");
	System.out.println("猫＝１　犬＝２？");
	int e = stdIn.nextInt();
	
	String x ="あなたが思い浮かべたのは";
	String y ="です";
	
	int z = a+b*10+c*100+d*1000+e*10000 ;
	

	if(z==12311) {System.out.println(x+"Aさん"+y);}
	if(z==22121) {System.out.println(x+"Bさん"+y);}
	if(z==12211) {System.out.println(x+"Cさん"+y);}
	if(z==21122) {System.out.println(x+"Dさん"+y);}
	if(z==11122) {System.out.println(x+"Eさん"+y);}
	if(z==22212) {System.out.println(x+"Fさん"+y);}
	
	if(z!=12311 && z!=22121 && z!=12211 && z!=21122 && z!=11122 && z!=22212) {
		System.out.println("あなたが思い浮かべている人はいません");
		System.out.println("どこかで間違えているかも");
	}
	
	}

}
package Course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		int b =1;
		int typhoon[] = {1,1,0,0,0,1,4,5,6,4,6,1};
		int d = 7;
		for(int c =0;c<=typhoon.length; c++) {
			if(c==d) {
				System.out.println(d+"月の台風の件数は"+typhoon[c-1]+"です。\n");
			}
		}
		
		for(int a:typhoon) {
			System.out.println(b+"月の台風の件数は"+a+"です。");
			b++;
		}
	}
}
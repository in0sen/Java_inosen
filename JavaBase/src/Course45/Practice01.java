package Course45;

public class Practice01 {

	public static void main(String[] args) {
		
		int[] numExArr = { 10, 50, 30, 20, 40 };
		
		int a = numExArr[4];
		numExArr[4] = numExArr[0];
		numExArr[0] = a;
		
		int b = numExArr[1];
		numExArr[1] = numExArr[3];
		numExArr[3] = b;
		
		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);
		System.out.println(numExArr[1]);
		System.out.println(numExArr[3]);
	}
}
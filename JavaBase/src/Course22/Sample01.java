package Course22;

import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {

		int[][] a = { { 10, 20, 30, }, { 40, 50, 60 }, { 70, 80, 90 } };
		//↓の省略型

		//二次元配列
		//縦、横の順番
		int[][] arr = new int[3][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		System.out.println(arr[1][0]);

		//サンプル問題０１
		System.out.println(arr[1][2]);

		//サンプル問題０２
		if (50 < arr[2][0])
			System.out.println("大きいです");

		//サンプル問題０３
		int sum = arr[1][1] + arr[2][2];
		System.out.println(sum);

		//サンプル問題０４
		System.out.println(Arrays.deepToString(arr));
		
		
	}
}
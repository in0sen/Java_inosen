package Course19;

public class Question01 {

	public static void main(String[] args) {

		String[] mygroup = new String[3];
		mygroup[0] = "鈴木";
		mygroup[1] = "伊藤";
		mygroup[2] = "伊東";
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 15;
		mygroupnum[1] = 2;
		mygroupnum[2] = 1;

		//↑一緒

		//String mygroup[] = {"鈴木","伊藤","伊東"};
		//int mygroupnum[] = {15,2,1};

		for (int a = 0; a < 3; a++) {
			System.out.print(mygroup[a]);
			System.out.println("," + mygroupnum[a]);
		}

		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];
		
		for (int a = 0; a < 3; a++) {
			System.out.println(myNum[a]);
		}
	}
}
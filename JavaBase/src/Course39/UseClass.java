package Course39;

public class UseClass {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "猪琉希";
		student1.no = 3;

		Student student2 = new Student();
		student2.name = "藤倉一樹";
		student2.no = 22;
		Student[] myfriend = new Student[2];
		myfriend[0] = student1;
		myfriend[1] = student2;
		for (Student a : myfriend) {
			System.out.println(a.name);
		}
	}
}
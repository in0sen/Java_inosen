package Course54;

public class StudentControll {

	public static void main(String[] args) {
		Student tonari = new Student(9, "鹿嶋柊弥");
		Student me = new Student(3, "猪琉希");
		Student[] mymen = { me, tonari };
		System.out.println(mymen[0].getName());
		mymen[1].setName("溝口真矢");
	}
}
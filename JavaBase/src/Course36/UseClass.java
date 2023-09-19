package Course36;

public class UseClass {

	public static void main(String[] args) {
		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();
		System.out.println();

		Kaden ka = new Kaden();
		ka.setName("洗濯機");
		ka.price = 10000;

		Kaden ka2 = new Kaden();
		ka2.setName("冷蔵庫");

		ka.display();
		ka2.display();

	}
}
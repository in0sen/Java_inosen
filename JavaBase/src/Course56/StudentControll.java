package Course56;

public class StudentControll {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("猪琉希");
		stu1.setSyussekibango(3);

		System.out.println(stu1.getName());
		System.out.println(stu1.getSyussekibango());

		PoPocke pocke = new PoPocke();
		pocke.setName("ピカチュウ");
		pocke.setZukanNo(25);
		pocke.setType("電気");
		pocke.setKotaichi(6);
		pocke.setNickname("ピカピカ");
		
	}
}
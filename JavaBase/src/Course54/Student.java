package Course54;

public class Student {

	private int syussekibango;
	private String name;

	public Student() {
		System.out.println("コンストラクタが動いたよ。");
	}

	public Student(int userInputSyusseki, String userInputName) {
		this.syussekibango = userInputSyusseki;
		this.name = userInputName;
	}

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
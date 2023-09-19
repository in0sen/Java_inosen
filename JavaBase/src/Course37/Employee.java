package Course37;

public class Employee {

	//明示的　はっきりさせること this.変数名
	//暗黙的　はっきりさせないこと

	private String name;
	static String company;
	private String yakusyoku;
	private int salary;

	Employee() {
		this.name = "未設定名前";
		this.company = "未設定会社";
		this.yakusyoku = "未設定役職";
		this.salary = 99999;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;

	}

	String getYakusyoku() {
		return yakusyoku;
	}

	void setYakusyoku(String yakusyoku) {
		this.yakusyoku = yakusyoku;

	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	void display() {
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this.yakusyoku);
		System.out.println(this.salary);
	}

}
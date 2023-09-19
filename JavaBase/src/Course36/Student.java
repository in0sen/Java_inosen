package Course36;

public class Student {

	private String name;
	private String course;
	static String school;

	Student() {
		name = "名無し";
		course = "所属無し";
	}

	void display() {
		System.out.println(name);
		System.out.println(course);
		System.out.println(school);
	}

	public String getName() {
		name = "あなたの名前は" + name;
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}
}
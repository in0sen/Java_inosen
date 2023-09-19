package Course44;

public class Human extends Creatures {
	private String name;
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	void disp() {
		System.out.println("私の名前は" + this.name + "です");
		System.out.println("私の趣味は" + this.hobby + "です");
	}

	void dispWeight() {
		System.out.println("体重は" + super.getWeight() + "gです");
	}
}
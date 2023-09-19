package Course44;

public class Animal extends Creatures {
	private String name;
	private String kari;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(super.getWeight());
		System.out.println(this.kari);
	}
}

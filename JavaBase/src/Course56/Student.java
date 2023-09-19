package Course56;

public class Student extends Human implements Gimu {

	private int syussekibango;

	public void study() {
		System.out.println("勉強します。義務なので。");
	}

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}
}
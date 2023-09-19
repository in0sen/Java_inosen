package Course44;

public class Life {

	private int jumyou;

	void death(String name) {
		System.out.println(name + "は" + jumyou + "年の寿命を全うし死んだ。そして天国から今も皆を見守っている。");
	}

	public int getJumyou() {
		return jumyou;
	}

	public void setJumyou(int jumyou) {
		this.jumyou = jumyou;
	}

}
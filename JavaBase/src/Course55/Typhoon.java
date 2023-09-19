package Course55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;

	Typhoon() {
		
	}
	Typhoon(int bango, String hi, String name) {
		setBango(bango);
		setHassei(hi);
		setName(name);
	}

	void setBango(int bango) {
		this.typhoonbango = bango;
	}

	int getBango() {
		return typhoonbango;
	}

	void setHassei(String hi) {
		this.hasseibi = hi;
	}

	String getHassei() {
		return hasseibi;
	}

	void setName(String name) {
		this.asiaName = name;
	}

	String getName() {
		return asiaName;
	}

	//デフォルトコンストラクタ
	//引数有りコンストラクタ
	//getter,setter
}
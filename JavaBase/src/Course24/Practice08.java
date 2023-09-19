package Course24;

public class Practice08 {

	public static void main(String[] args) {
		int tensu=100;
		calledMethod(tensu);
		
	}
	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は"+tensu+"です");
	}
}
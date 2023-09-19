package Course19;

public class Practice04 {

	public static void main(String[] args) {

		int logicArray[] = { 100, 50, 75, 80, 65 };
		
		
		for (int s = 0; s < logicArray.length; s++) {
			if (s == logicArray.length-1) {
				System.out.println(logicArray[s]);
			}
			
			
			int f = logicArray[s];
			int g = 0;
			
			
			for (int d = logicArray.length-1; s < d; d--) {
				if (logicArray[s] > logicArray[d]) {
					logicArray[s] = logicArray[d];
					g = d;
				}
				if (s == d - 1) {
					System.out.println(logicArray[s]);
					logicArray[g] = f;
				}
			}
		}
	}
}
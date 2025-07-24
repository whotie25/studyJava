public class _007_Loops {
	public static void main(String[] args) {
		//while loop
		int a = 5;
		while(a > 0) {
			System.out.println("Hello, World! (" + a + ")");
			a--;
		}
		System.out.println();
		
		//for loop
		for(int i = 1; i < 6; i++) {
			System.out.println("Hello, World! (" + i + ")");
		}
	}
}
import java.util.Scanner;

public class _012_InputOutput_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int res = 0;
		
		System.out.print(">>> ");
		while(sc.hasNextInt()) {
			res += sc.nextInt();
			System.out.println("<<< " + res);
			System.out.print(">>> ");
		}
		
		sc.close();
	}
}
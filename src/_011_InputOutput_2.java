import java.util.Scanner;

public class _011_InputOutput_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("operator : ");
		String op = sc.next();
		
		sc.close();
		
		//OUTPUT
		if(op == "+") System.out.println("a + b = " + (a+b));
		else if(op == "-") System.out.println("a - b = " + (a-b));
		else System.out.println("It can operating only addition n' subtraction.");
	}
}
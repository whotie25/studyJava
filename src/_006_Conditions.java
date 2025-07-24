import java.util.Scanner;

public class _006_Conditions {
	public static void main(String[] args) {
		//If - Else
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오. : ");
		int num = sc.nextInt();
		
		if(num == 10) System.out.println("correct, 10.");
		else if(num < 10) System.out.println("Up!");
		else System.out.println("Down!");
		
		//Switch
		switch(num) {
		case 10:
			System.out.println("correct, 10.");
			break;
		default:
			System.out.println("wrong!");
		}
	}
}
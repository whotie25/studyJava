public class _002_DataTypeAndVariable {
	public static void main(String[] args) {
		//integer
		int a;  	//declaration n' definition
		a = 10; 	//initialization
		System.out.println("a = " + a);
		
		//float
		float b;
		b = 3.14f;
		System.out.println("b = " + b + "\n");
		
		//10 - 3.14 = 6.86...? (Floating Point)
		if(a-b == 6.86) System.out.println("True, " + a + " - " + b + " = " + (a-b) + "\n");
		else System.out.println("False, " + a + " - " + b + " = " + (a-b) + "\n");
		
		//string
		String sayHello = "Hello, World!"; //definition n' initialization
		System.out.println(sayHello);
	}
}
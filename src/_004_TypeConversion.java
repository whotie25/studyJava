public class _004_TypeConversion {
	public static void main(String[] args) {
		//implicit conversion
		double a = 3.14;
		double b = 3.14F;
		/*float c = 3.14;*/ float c = 3.14F;
		System.out.println(a + "\n" + b + "\n" + c + "\n");
		
		int x = 5;
		float y = 3.0F;
		System.out.println("x + y = " + (x+y));
		
		//explicit conversion
		System.out.println("x + y = " + (int)(x+y) + " (converse to int)\n");
	}
}
public class _003_DataType {
	public static void main(String[] args) {
		byte a = 127;
		System.out.println("a = " + a);
		
		a++; //127(10) + 1(10) = 1000 0000(2) = -128(10) 
		System.out.println("a++ = " + a); //stack overflow
		
		/* byte   - 1byte
		 * short  - 2byte
		 * int    - 4byte (default)
		 * long   - 8byte */
		
		/* float  - 4byte
		 * double - 8byte */
		
		/* char   - 2byte */
		
		
	}
}
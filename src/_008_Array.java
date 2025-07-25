public class _008_Array {
	public static void main(String[] args) {
		byte[] primes = {2, 3, 5, 7, 11, 13, 17};
		System.out.print("P = {");
		for(int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + ", ");
		}
		System.out.println("...}\n");
		
		String[] fruits = new String[5];
		System.out.println("Length of Array : " + fruits.length); //5
		fruits[0] = "apple"; fruits[1] = "banana"; fruits[2] = "orange"; 
		System.out.println("Length of Array : " + fruits.length); //5
		fruits[3] = "grape"; fruits[4] = "peach";
		System.out.println("Length of Array : " + fruits.length); //5
		
		System.out.println();
		
		//for-each
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
	}
}
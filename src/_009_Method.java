public class _009_Method {
	public static void main(String[] args) {
		System.out.println("|10| = " + abs(10));
		System.out.println("|-5| = " + abs(-5));
		System.out.println("2^5 = " + pow(2, 5));
		System.out.println("3^4 = " + pow(3, 4));
		
	}
	
	public static int abs(int num) {
		if(num < 0) return -num;
		return num;
	}
	
	public static int pow(int num, int exp) {
		int res = 1;
		for(int i = 0; i < exp; i++) {
			res *= num;
		}
		return res;
	}
}
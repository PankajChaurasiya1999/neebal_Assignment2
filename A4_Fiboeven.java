package neebalDay2;



public class A4_Fiboeven {
	public static void main(String[] args) {
		int c = 10;
		int[] evenFibo = new int[c];
		int a = 0, b = 1; 
		for (int i = 0; i < c;) {
			if (a % 2 == 0) {
				evenFibo[i] = a;
				i++;
			}
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println("First 10 even Fibonacci numbers:");
		for (int num : evenFibo) {
			System.out.println(num);
		}
	}
}

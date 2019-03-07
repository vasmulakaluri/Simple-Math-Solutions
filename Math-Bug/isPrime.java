public class Solution {
	public int isPrime(int A) {
		int upperLimit = A/2; //(int)(Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (A % i == 0 ) return 0;
		}
		if (A == 1 || A == 0) {
		    return 0;
		}
		return 1;
	}
}

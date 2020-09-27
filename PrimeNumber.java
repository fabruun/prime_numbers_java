public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println(nthPrime(3301));
		
	}

	private static boolean checkPrime(int n) {
		int i = 2;
		boolean isPrime = true;
		while(i < n) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
			i = i + 1;
		}
		
		return isPrime;
	}

	private static int countPrimes(int n) {
		int i = 2;
		int primes = 0;
		while(i < n) {
			if(checkPrime(i)) {
				primes = primes + 1;
			}
			i = i + 1;
		}

		return primes;
	}

	private static int nthPrime(int n) {
		int nthPrime = countPrimes(n) + 1;
		return nthPrime;
	}
}
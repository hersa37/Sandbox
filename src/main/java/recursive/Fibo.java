package recursive;

public class Fibo {
	public static int fibo(int n) {
		if(n == 2) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n -2) + fibo(n - 1);
		}
	}

	public static int fibonacci(int n) {
		if((n == 1) || (n == 0)) {
			return n;
		} else {
			return fibonacci(n -1) + fibonacci(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(fibo(10));
		System.out.println(fibonacci(10));
	}
}

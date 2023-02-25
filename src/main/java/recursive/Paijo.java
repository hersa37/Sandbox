package recursive;

public class Paijo {

	public static int paijo(int x) {
		if (x == 0)
			return 0;
		return 2 * paijo (x - 1) + x * x;
	}

	public static void main(String[] args) {
		System.out.println(paijo(10));
	}
}

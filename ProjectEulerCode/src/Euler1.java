public class Euler1 {
	public static void main(String[] args) {
		int value = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				value += i;
			}

		}
		System.out.println(value);
	}
}

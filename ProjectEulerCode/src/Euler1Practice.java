public class Euler1Practice {

	public static void main(String[] args) {
		int value = 0;
		value = multiplesOf3And5(value);

		System.out.println(value);
	}

	private static int multiplesOf3And5(int value) {
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				value += i;
			}
		}
		return value;
	}

}
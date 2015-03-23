public class Euler5 {

	public static void main(String[] args) {
		int[] values = new int[20];
		for (int i = 0; i < 20; i++) {
			values[i] = i + 1;
		}
		int value = 1;
		for (int i = 0; i < values.length; i++) {
			if (values[i] != 1) {
				value *= values[i];
				for (int j = values.length - 1; j >= i; j--) {
					if (values[j] % values[i] == 0) {
						values[j] = values[j] / values[i];
					}
				}
			}
		}
		System.out.println(value);

	}

}

import java.util.Random;

public class zadanieChetire {
	public static void main(String[] args) {
		int x = getRandomX();
		System.out.println("chislo: " + x);
		if (x % 10 == 1) {
			System.out.println(x + " рубль");
		}

		if (x % 10 == 2 | x % 10 == 3 | x % 10 == 4) {
			System.out.println(x + " рубля");
		}

		if (x % 10 == 5 | x % 10 == 6 | x % 10 == 7 | x % 10 == 8 | x % 10 == 9 | x % 10 == 0) {
			System.out.println(x + " рублей");
		}
	}

	private static int getRandomX() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}
}

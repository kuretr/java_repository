import java.util.Random;

public class zadanieShest {
	public static void main(String[] args) {
		int min = 1000;
		int max = 9999;
		int x = randInt(1000, 9999);
		int a = x / 1000;
		int b = (x / 100) % 10;
		int c = (x / 10) % 10;
		int d = x % 10;

		if (a == b || a == c || a == d || b == c || b == d || c == d) {
			System.out.println("в числе " + x + " есть одинаковые цифры");
		} else {
			System.out.println("в числе " + x + " нет одинаковых цифр");
		}
	}

	public static int randInt(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}

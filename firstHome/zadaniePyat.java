import java.util.Random;

public class zadaniePyat {
	public static void main(String[] args) {
		int min = 1000;
		int max = 9999;
		int x = randInt(1000, 9999);
		int a = x / 1000;
		int b = (x / 100) % 10;
		int c = (x / 10) % 10;
		int d = x % 10;
		System.out.println("chislo " + x);
		int x1 = ((((d * 10 + c) * 10) + b) * 10) + a;
		System.out.println("v obratnom poryadke " + x1);

	}

	public static int randInt(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
}

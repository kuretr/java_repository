import java.util.Random;

public class zadanieSecond {
	public static void main(String[] args) {
		int x = getRandomX();
		System.out.println("chislo: " + x);
		if (x / 100 >= 1) {
			System.out.println("Chislo trehznachnoe");
		} else {
			System.out.println("ne trehznachnoe ");
		}
		if (x % 10 == 7) {
			System.out.println("Chislo zakanchivaetsya na 7");
		} else {
			System.out.println("Chislo ne zakanchivaetsya 7");
		}
		if (x % 2 == 0) {
			System.out.println("Chislo chyotnoe");
		} else {
			System.out.println("Chislo ne chyotnoe");
		}

	}

	private static int getRandomX() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}
}

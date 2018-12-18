
public class zadanieTri {
	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		int r = 6;
		double diagonal = Math.sqrt(a*a + b*b);
		double diametr = r * r ;
		System.out.println("diagonal = " + diagonal);
		System.out.println("diametr = " + diametr);
		if (r * r >= Math.sqrt(a*a + b*b) ) {
			System.out.println("mozhno");
		} else {
			System.out.println("nel'zya");
		}
	}
}

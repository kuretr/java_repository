
public class min {
	public static void main(String[] args) {
		int sec = 4_500;
		int min = sec / 60;
		int secRest = sec % 60;
		int hours = min / 60;
		int hourRest = min % 60;
		int day = hours / 24;
		int dayRest = hours % 24;
		int week = day / 7;
		int weekRest = day % 7;

		System.out.println(" minut is: " + min + " second." + secRest);
		System.out.println("OR");
		System.out.println(" hours is: " + hours + " minut: " + hourRest + " second." + secRest);
		System.out.println("OR");
		System.out.println(" day: " + day + " hours is: " + hours + " minut: " + hourRest + " second." + secRest);
		System.out.println("OR");
		System.out.println(" week: " + week + " day: " + day + " hours is: " + hours + " minut: " + hourRest
				+ " second." + secRest);
		System.out.println("OR");
		System.out.println(" week: " + week + " ostatok " + weekRest);
	}
}

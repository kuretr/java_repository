import java.util.Scanner;
public class ProstoeChislo {
    public static int a, div;
//является ли чисо простым
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        a = scan.nextInt();
        for (int del = 2; del <= a; del++) {
            if (a % del == 0) {
                div++;
                if (div > 2) {
                    System.out.println("Число составное");
                    break;
                }
            }
        }
        if (div < 3) {
            System.out.println("Число простое");
        }
    }
}
import java.util.Scanner;
//найти сумму первых n чисел, которые делятся на 3 без остатка
// где-то очень сильно затупил и не могу понять где.
public class SummN {
    public static int randomnieChisla , kolichestvoChisel, poryadkoviNomer =1 , summaChisel;
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            randomnieChisla = (int) (Math.random()*94848);
            System.out.println(randomnieChisla);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        kolichestvoChisel = scan.nextInt();
        while (poryadkoviNomer!=kolichestvoChisel){
            if(randomnieChisla%3 == 0 ){
                summaChisel = summaChisel + randomnieChisla;
                poryadkoviNomer++;


            }
        }
        System.out.println(summaChisel);
    }

}

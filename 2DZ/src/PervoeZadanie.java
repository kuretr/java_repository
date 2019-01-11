//посчитать факториал числа в гранницах от 10 до 15
public class PervoeZadanie {
    public static int factorial (int n ) {
        int  fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println(" Факториал 12 = " + factorial (12));
    }
}
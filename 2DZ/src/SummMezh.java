import java.util.Random;
//найти сумму чисел между большим и меньши чисом массива
public class SummMezh {
    public static void main(String[] args){
        Random random = new Random();
        int[] mass = new int[10];

        int max = 0,min = 1000, indexMax = 0, indexMin = 0, sum = 0;

        for(int i = 1; i<mass.length; i++) {
            mass[i] = random.nextInt(100);
            System.out.print(mass[i]+"\t" );
        }

        for (int i = 1; i< mass.length; i++){
            if(max < mass[i]){
                max = mass[i];
                indexMax = i;
                }
        }
        for (int i = 1; i< mass.length; i++){
            if(min > mass[i]){
                min = mass[i];
                indexMin = i;
            }
        }
            System.out.println("Позиция максимального числа \n"+indexMax );
            System.out.println("Позиция минимального числа \n"+indexMin);

        if (indexMin > indexMax) {
            for (int i = indexMax; i <= indexMin; i++) {
                sum += mass[i];
            }
        } else {
            for (int i = indexMin; i <= indexMin; i++) {
                sum +=  mass[i];
            }
        }

        System.out.println("\n" + "Сумма элементов между максимальным и минимальным значениями: " + sum);


    }
}

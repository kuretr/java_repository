import java.util.Random;
//Создать массив, распечатать, перевернуть и распечатать
public class PovorMassiva {
    public static void main(String[] args){
        int mass[]=new int[10];
        Random rand = new Random();

        for (int i = 0; i<mass.length; i++){
            mass[i] = rand.nextInt(10)+1;
            System.out.print(mass[i]+"\t");
        }

        for (int i = 0; i<mass.length/2; i++){
            int j = mass[i];
            mass[i]= mass[mass.length-i-1];
            mass[mass.length-i-1]=j;

        }
        System.out.println();
        for (int i =0; i<mass.length; i++){
            System.out.print( mass[i]+"\t");
        }
    }
}

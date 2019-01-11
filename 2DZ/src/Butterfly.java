//Создать двумерный квадратный массив (произвольной длины!!!!) и заполнить его «бабочкой», т.е.
import java.util.Random;
import static java.lang.System.out;
public class Butterfly {
    public static void main(String[] args){
        int i, j ;
        Random rand = new Random();
        int raz = rand.nextInt(10);
        int mass[][] = new int[6][6];

        for (i=0; i<mass.length/2+1; i++){
            for(j=0; j<mass[i].length; j++){
                if ((j<i) || (j>=(mass[i].length-i)))
                    mass[i][j]= 1;
                else
                    mass [i][j]=0;

            }
        }
        for (i=mass.length-1; i>=mass.length/2; i--){
            for (j=0; j<mass[i].length; j++){
                if ((j<(mass[i].length-1-i)) || (j>i))
                    mass[i][j]=1;
                else
                    mass[i][j]=0;
            }
        }
        for (i=0; i<mass.length;i++){
            for(j=0; j<mass[i].length; j++){
                System.out.print(mass[ i][j]);
            }
            System.out.println(" ");
        }

    }
}

import java.util.Random;

public class Massiv {
  //вывести максимальную оценку и ее номер, первую и последнюю
    public static void main(String[] args) {
       Random rand = new Random();
       int mass[] = new int[10];
       int max = 0, number = 0;

       for(int i = 0; i<mass.length;i++){
           mass[i]=rand.nextInt(10)+1;
           System.out.println("Оценки учеников в классе: " + mass[i]);
       }
       for(int i =1; i<mass.length; i++){
           if(max<mass[i]){
               max = mass[i];
               number = i;
           }
       }
       System.out.println("Максимальная оценка: "+max +" её номер "+ number);
       System.out.println("Первая "+mass[0]);
       System.out.println("Последняя "+ mass[mass.length-1]);

    }
}
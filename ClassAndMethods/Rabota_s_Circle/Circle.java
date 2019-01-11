import java.util.Scanner;
import java.lang.*;
//Создайте в классе Circle метод, вычисляющий длину окружности.
//	a. Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата
//координатной плоскости с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что
//требуется создать обычный метод, применимый к уже существующему объекту, а не
//конструктор создающий новый объект.
//	b. Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта
//с его помощью, координаты центра и радиус окружности пользователь вводил с
//клавиатуры.
//	c. Создайте в классе Circle метод, вычисляющий расстояние между центрами двух
//окружностей.
//	d. Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке.
//Учтите, что возможен вариант, когда одна окружность содержится внутри другой и при
//этом всё равно возможно касание в одной точке.
//
//
//
//
//
//

class Circle {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double r1;
    public double r2;
    public double pi = 3.14;
    public double aPerenos;
    public double bPerenos;
    public double rast;

    public void vvodCircle1() {

        System.out.println("ввести число x: ");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            x1 = sc1.nextInt();
        }
        System.out.println("вести число y: ");
        Scanner sc2 = new Scanner(System.in);
        if (sc2.hasNextInt()) {
            y1 = sc2.nextInt();
        }
        System.out.println("вести число r: ");
        Scanner sc3 = new Scanner(System.in);
        if (sc3.hasNextInt()) {
            r1 = sc3.nextInt();
        }
    }

    public void vvodCircle2() {

        System.out.println("ввести число x: ");
        Scanner sc4 = new Scanner(System.in);
        if (sc4.hasNextInt()) {
            x2 = sc4.nextInt();
        }
        System.out.println("вести число y: ");
        Scanner sc5 = new Scanner(System.in);
        if (sc5.hasNextInt()) {
            y2 = sc5.nextInt();
        }
        System.out.println("вести число r: ");
        Scanner sc6 = new Scanner(System.in);
        if (sc6.hasNextInt()) {
            r2 = sc6.nextInt();
        }
    }

    public void printCircle1() {
        System.out.println("Окружность с центром (" + x1 + ";" + y1 + ") и радиусом " + r1);
    }
    public void printCircle2(){
        System.out.println("Окружность с центром (" + x2 + ";" + y2 + ") и радиусом " + r2);
    }

    public void perenos() {
        x1 = x1 + aPerenos;
        y1 = y1 + bPerenos;
        System.out.println(" Центр круга смещен в точки(" + x1 + ";" + y1 + ")");
    }

    public void randomCenter() {
        aPerenos = (int) (Math.random() * 199 - 99);
        bPerenos = (int) (Math.random() * 199 - 99);
        System.out.println("Сместить центр окружности на координаты(" + aPerenos + ";" + bPerenos + ")");
    }

    public void dlinaOkryzhnosti() {
        double l = pi * 2 * r1;
        System.out.println("Длинна окружности: " + l);
    }

    public int length() {
        int length = (int)Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return length;
            }

    // - не хватает проверки пересечения в олной точке

}
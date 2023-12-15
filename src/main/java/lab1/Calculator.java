package lab1;

import java.util.Scanner;

public class Calculator {
    private static final Scanner sc = new Scanner(System.in);
    static public void calculateCircumference() {//длина окружности
        System.out.print("Введите радиус для вычисления длины окружности");
        int radius = 0;
        while(!sc.hasNextInt()){
            System.out.println("Введите целое число");
            sc.next();
        }
        radius = sc.nextInt();
        System.out.printf("Длина окружности: %.0f \n", 2 * Math.PI * radius);
    }
    static public void calculateArea() {//площадь круга
        System.out.print("Введите радиус для вычисления площади круга");
        while(!sc.hasNextInt()){
            System.out.println("Введите целое число");
            sc.next();
        }
        int radius = sc.nextInt();
        System.out.printf("Площадь круга: %.0f \n",Math.PI * Math.pow(radius, 2));
    }
}

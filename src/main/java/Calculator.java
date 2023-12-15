import java.util.Scanner;

public class Calculator {
    private static final Scanner sc = new Scanner(System.in);
    static public void calculateCircumference() {//длина окружности
        System.out.print("Введите радиус для вычисления длины окружности");
        int radius = sc.nextInt();
        System.out.println(2 * Math.PI * radius);
    }

    static public void calculateArea() {//площадь круга
        System.out.print("Введите радиус для вычисления площади круга");
        int radius = sc.nextInt();
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}

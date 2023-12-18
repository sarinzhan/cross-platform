package lab2;

import com.sun.security.jgss.GSSUtil;

import java.text.DateFormatSymbols;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CalcDate {
    static Scanner scanner = new Scanner(System.in);
    public static void perioadBetween(){
            System.out.print("Введите время в формате yyyy:MM:dd ");
            String inputTime = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
            LocalDate date = LocalDate.parse(inputTime, formatter);
            System.out.println("Вы ввели: " + date);
        Period period = Period.between(date,LocalDate.now());
        System.out.printf("Разница между введенной и текущей датой составляет: %d лет %d месяцев %d дней\n\n",period.getYears(),period.getMonths(),period.getDays());
    }
    public static void getMonth(){
        System.out.print("Введите месяц по номеру");
        int i = scanner.nextInt();
        LocalDate date = LocalDate.of(2000,i,1);
        System.out.println("Название месяца: " + date.getMonth().name());
    }
}

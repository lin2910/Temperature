import java.util.Scanner;


//Перевод температуры в градусах Цельсия в градусы Фаренгейта
public class Converter {
    final static double eps = 0.001;

    public static void main(String[] args) {
        double celsius;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the temperature in degrees Celsius: ");
        celsius = in.nextInt();
        System.out.println();
        double fahrenheit;
        if (celsius < eps)
            fahrenheit = 32.8;
        else
            fahrenheit = celsius * 9 / 5 + 32;
        System.out.print("Temperature in degrees Fahrenheit: ");
        System.out.format("%.1f%n", fahrenheit);

    }


}


import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static double pi = 3.14;

    public static double area(double R) {
        double result = pi * R * R;
        return result;
    }

    public static double circumference(double R) {
        double result = Math.round(2 * pi * R);
        return result;
    }

    public static double volume(double R) {
        double result = Math.round(4/3 * pi * R * R *R) ;
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах:");
        double R = scanner.nextInt();

        double a = area(R);
        double b = circumference(R);
        double c = volume(R);

        System.out.println("Площадь круга:" + a + "кв.см");
        System.out.println("Длина окружности:" + b + "см");
        System.out.println("Объём шара:" + c + "куб.см");

    }

}
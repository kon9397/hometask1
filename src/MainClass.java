import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double number = Double.parseDouble(br.readLine());

        System.out.println(square(number));

        int userNumber = Integer.parseInt(br.readLine());
        int userPow = Integer.parseInt(br.readLine());

        System.out.println(power(userNumber, userPow));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(equation(a, b, c));
    }

    public static double square(double a) {
        return Math.sqrt(a);
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static String equation(int a, int b, int c) {
        int D = (int) Math.pow(b, 2) - 4 * a * c;

        if(D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            return "Два корня: x1 = " + x1 + "; x2 =" + x2 ;
        } else if(D == 0) {
            double x = -b / (2 * a);

            return "Один корень: x = " + x;
        } else {
            return "Корней нет";
        }
    }
}

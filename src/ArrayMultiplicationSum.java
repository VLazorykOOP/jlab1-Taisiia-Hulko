import java.util.Scanner;
public class ArrayMultiplicationSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n= ");
        float n = in.nextFloat();
        System.out.print("m= ");
        float m = in.nextFloat();

        double result1 = Math.pow(((n + 1) / (m + 2) + 5 / (n - m)), 2) * n * m;
        System.out.println("Результат для дійсних чисел: " + String.format("%.2f", result1));

        int nInt = (int) n;
        int mInt = (int) m;
        double result2 = Math.pow(((nInt + 1) / (mInt + 2.0) + 5 / (nInt - mInt * 1.0)), 2) * nInt * mInt;
        System.out.println("Результат для цілих чисел: " + String.format("%.2f", result2));

        int result3 = (int) result1;
        System.out.println("Результат для дійсних чисел, округлений до цілого: " + result3);

        in.close();
    }
}


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayUnionProduct {

    static Scanner in;

    static int[] InputArray(String arrayName) {
        System.out.print("Введіть кількість елементів для масиву " + arrayName + ": ");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print(arrayName + "[" + i + "]= ");
            array[i] = in.nextInt();
        }
        return array;
    }

    static void PrintArray(Set<Integer> set) {
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void ProcessUnionAndProduct(int[] X, int[] Y) {
        Set<Integer> unionSet = new HashSet<>();

        for (int x : X) {
            unionSet.add(x);
        }
        for (int y : Y) {
            unionSet.add(y);
        }

        System.out.println("Елементи об'єднання:");
        PrintArray(unionSet);

        int product = 1;
        int sum = 0;

        for (int num : unionSet) {
            product *= num;
            sum += num;
        }

        System.out.println("Добуток елементів об'єднання: " + product);
        System.out.println("Сума елементів об'єднання: " + sum);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);

        // Введення масивів
        int[] X = InputArray("X");
        int[] Y = InputArray("Y");

        // Обробка масивів: об'єднання, добуток і сума
        ProcessUnionAndProduct(X, Y);

        in.close();
    }
}

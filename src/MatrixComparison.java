import java.util.Scanner;
//завдання 3
public class MatrixComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір матриць (не більше 15): ");
        int n = scanner.nextInt();
        if (n > 15) {
            System.out.println("Розмір не може бути більшим за 15.");
            return;
        }

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[] X = new int[n];

        System.out.println("Введіть елементи матриці A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            boolean allNegative = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] >= 0 || B[i][j] >= 0) { 
                    allNegative = false;
                    break;
                }
            }
            if (allNegative) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
        }

        System.out.println("Вектор X:");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }

        scanner.close();
    }
}


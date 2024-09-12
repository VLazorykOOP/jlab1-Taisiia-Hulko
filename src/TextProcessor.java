import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String inputText = scanner.nextLine();

        String[] words = inputText.split("(?<=\\b)|(?=\\b)");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.trim().isEmpty() || word.matches("[.,!?]")) {
                result.append(word);
                continue;
            }

            if (word.length() % 2 == 1) {
                int middleIndex = word.length() / 2;
                word = word.substring(0, middleIndex) + word.substring(middleIndex + 1);
            }
            result.append(word);
        }

        System.out.println("Результат:");
        System.out.println(result.toString());

        scanner.close();
    }
}

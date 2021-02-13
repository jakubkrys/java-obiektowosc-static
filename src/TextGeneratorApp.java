import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TextGeneratorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        StringBuilder sentence = new StringBuilder();
        System.out.print("Min length of text: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Max length of text: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        Text text = new Text(min,max);
        int size = (text.generateSize(min,max));
        char[] charTable = new char[size];

        for (int i = 0; i < charTable.length; i++) {
            charTable[i] = text.generateLetter();
        }

        for (char c : charTable) {
            sentence.append(c);
        }
        System.out.println("Sentence length: "+charTable.length);
        System.out.print("Generated sentence: "+sentence);
    }
}

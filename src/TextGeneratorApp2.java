import java.util.Scanner;

public class TextGeneratorApp2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter text length: ");
            int size = scanner.nextInt();

            String text = Text2.text(size);
            System.out.println(text);
        }
    }
}

import java.util.Scanner;

public class PostcodesGeneratorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 6;


        while (true) {
            System.out.println("1. Generate postcode");
            System.out.println("0. Quit");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option != 0) {
                String postcode = PostcodesGenerator.postcode(size);
                System.out.println();
                System.out.println(postcode);
                System.out.println();
            } else {
                break;
            }
        }
    }
}
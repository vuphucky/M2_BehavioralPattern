import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new BinObserver(sub);
        new OctObserver(sub);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter a number: ");
            sub.setState(scanner.nextInt());
        }
    }
}
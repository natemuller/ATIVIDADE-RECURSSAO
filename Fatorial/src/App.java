import java.util.Scanner;
public class App {

    public static int Fatorial (int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Fatorial (num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%d\n", Fatorial(num));
        scanner.close();
    }
}

public class App {

    public static int Fatorial (int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Fatorial (num - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(args[0]);
        System.out.printf("%d\n", Fatorial(int num));
    }
}

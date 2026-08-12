public class Recurs {

    static void printNumbers(int n) {
        if (n > 5) {
            return;   // base condition
        }

        System.out.println(n);
        printNumbers(n + 1);   // recursive call
    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
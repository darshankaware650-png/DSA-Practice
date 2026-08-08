public class Practice {

    static void printNumbers(int n) {
        // Base case
        if (n > 5) {
            return;
        }

        System.out.println(n);

        // Recursive call
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
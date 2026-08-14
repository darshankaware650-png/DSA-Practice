import java.util.Scanner;
public class Factorial {
    public static int printfactorial(int n){
        if(n==1 || n==0){
           return 1;
        }
        int fact_nm1 = printfactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = printfactorial(n);
        System.out.println(ans);
    }
}

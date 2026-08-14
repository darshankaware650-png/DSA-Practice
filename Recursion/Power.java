public class Power{
    public static int printPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xPowerm1 = printPower(x, n-1);
        int xPown = x * xPowerm1;
        return xPown;
     }

     public static void main(String[] args) {
         int x =2, n=5;
         int ans = printPower(x, n);
         System.out.println(ans);
     }
}
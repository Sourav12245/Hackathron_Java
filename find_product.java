package Learn_java_looping;
import java.lang.Math;
import java.util.Scanner;
public class find_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inparr = new int[n];
        for(int i = 0; i <=n-1;i++) inparr[i] = sc.nextInt();
        double k = Math.pow(10,9) + 7;
        long[] ans = new long[2];
        ans[0] = 1;
        ans[1] = 1;
        for(int i = 0;i<=inparr.length-1;i++)
        {
            ans[0] = (long) ((ans[1] * inparr[i]) % k);
            ans[1] = ans[0];
        }
        System.out.println(ans[1]);
    }
}

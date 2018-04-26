package Palindrome;
//import java.util.Scanner;
public class find_product {
    public static void main(String[] args){
//        int n = 20;
         long[] inparr = new long[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21}; //,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        // get the array number
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //5
//        // get the array
//        int[] inparr = new int[n];
//        for(int i = 0; i <=n-1;i++) inparr[i] = sc.nextInt();
        long[] ans = new long[2];
        ans[0] = 1;
        ans[1] = 1;
        for(int i = 0;i<=inparr.length-1;i++)
        {
            ans[0] = (ans[1] * inparr[i]) % (10^9 + 7);
            ans[1] = ans[0];
        }
        System.out.println(ans[1]);
    }
    
}

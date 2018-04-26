package Palindrome;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sti = sc.nextLine();
        float b = sti.length()%2;
        if (b == 0.0) even(sti);
        else odd(sti);
        
    }
    static void even(String st)
    {
        String k = st.substring(0, st.length()/2);
        String g = st.substring(st.length()/2, st.length());
        String rev = "";
        for(int i = g.length()-1; i>=0; i--)rev = rev + g.charAt(i);
        Boolean comp = rev.equals(k);
        if(comp == true) System.out.print("YES");
        else System.out.print("NO");
    }
    static void odd(String st)
    {
        String k = st.substring(0, st.length()/2);
        String g = st.substring(st.length()/2+1, st.length());
        String rev = "";
        for(int i = g.length()-1; i>=0; i--)rev = rev + g.charAt(i);
        Boolean comp = rev.equals(k);
        if(comp == true) System.out.print("YES");
        else System.out.print("NO");
    }
} 
package CodeForces;
/**
 *
 * @author sourav.e.ghosh
 */
import java.util.Scanner;
public class Pair_of_lines {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      char[] ch = new char[k*k];
      int l = 0;
      for(int i=0;i<=k;i++)
      {
          for(int b = 0; b<=4 ;b++)
          {
              sc.next().getChars(0, b, ch, l);
          }
         l = l +5;
      }
      
      
//      char[] ch = new char[k];
//      for(int i = 0;i <= k-1;i++)
//      {
//          
//          char c = sc.next().charAt(i);
//          char c = sc.next().chars();
//          ch[i] = c;
//      }
      
      for(int i = 0;i<=ch.length-1;i++)System.out.print(ch[i]);
  }  
}

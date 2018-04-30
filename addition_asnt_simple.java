package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;
public class addition_asnt_simple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s1 = new char[]{};
        // input the characters
        s1 = sc.next().toCharArray();
        // reverse the char
        char[] arr1 = new char[s1.length];
        int k = s1.length-1;
        for(int i =0;i<=s1.length-1;i++)
        {
            arr1[i] = s1[k];
            k = k -1;
        }
        for(int i =0;i<= arr1.length-1;i++) System.out.print(arr1[i]);
         //load the numbers and alphabets in a array so as to search and sort them
//    int[] numb = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21
//            ,22,23,24,25,26};
    String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j","k",
        "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    // code to assign the alphabet range once incex is 26.
    int[] arr2 = new int[arr1.length];
//    int[] arr3 = new int[arr1.length];
    for(int i =0;i<=arr1.length-1;i++)
    {
        // get the index number store somewere-a.
        int a = Arrays.asList().indexOf(s1[i]);
        // get the index of the opposite alpha and store somewere -b.
        int b = Arrays.asList().indexOf(arr1[i]);
        // sum c = a+b;
        int c = a + b;   
        // if sum of c > 26, srart the c from "a". i.e subtraction can be used
                // if not than it can be stored directly
        if(c <=26)
        {
            arr2[i] = c;
        }
        else
        {
            c = c - 26;
            arr2[i] = c;
        }
        // this will give the index number of the alphabet
        // from the index number find alphabet
        
        // store in an array
    }
    for(int i =0;i<= arr2.length-1;i++) System.out.print(arr2[i]);    
    // algorithm to assign the stuff
}

    
}

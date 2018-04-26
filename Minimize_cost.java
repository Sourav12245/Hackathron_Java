package Palindrome;
public class Minimize_cost {
// input the array
    public static void main(String[] args){
        int[] arr = new int[]{3,-1,-2};
        // input K value
        int k = 2;
        int[] arr3 = new int[]{};
        // select a number from the array and into a FOR loop
        // Call a f1() from the loop. The function will retuen a value
        // put the value into a array still inside FOR loop
        for(int i = 0; i<= arr.length-1;i++)
        {
         int l = arr[i];
         System.out.println(i);
         int n = array_check(l,k,arr);
         System.out.println(i);
         // The array is put out  of the loop
         arr3[i] = n;
        }
        ///////////////////////////////////////////////////////
//        for(int i = 0; i<= arr3.length-1;i++)
//        {
//         System.out.println(arr3[i]);
//        }
        ///////////////////////////////////////////////////////
        // get the sum of the array and print output
        
    }
// F1() is called int fx(number to be removed, k value, array value)
static int array_check(int l2, int k2,int[] arr2){
    int[] arr4 = new int[]{};
    arr4  = arr2.clone();
// remove the number/ or make it 0 from the given number and store the rest of the numbers in array
for(int s = 0; s <= arr2.length-1;s++)
{
    if(arr4[s] == l2)
    {
        arr4[s] = 0;
        
    }
}
////////////////////////////////////////////////////////////////
for(int s = 0; s <= arr2.length-1;s++)
{
    System.out.println(arr4[s]);
}
/////////////////////////////////////////////////////////////////
// use FOR loop to add the numbers in the array, range upto k value
int c = 0;
System.out.println(l2);
//for(int s = 0; s <= arr2.length-1;s++)
//{
//    c = c + arr4[s];
//    
//}
// return the output   
return c;
}
    
}

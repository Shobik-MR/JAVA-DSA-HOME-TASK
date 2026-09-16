import java.util.*;
public class SinglePointer{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       } 

         System.out.print(Arrays.toString(arrayRev(arr))); 
          
      
      
    }
    public static int[] arrayRev(int[] arr){
        int i=0;
        while(i<arr.length-i-1){
      int temp = arr[i];
      arr[i]= arr[arr.length-1-i];
      arr[arr.length-i-1]=temp;
      i++;
      

        }
       return arr;
    }
}
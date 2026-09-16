// Given an array of daily measurements, after each day calculate:
// maximum value seen so far - minimum value seen so far
// Example
// Input:
// 5
// 10 5 15 8 20
// Running maximum:
// 10 10 15 15 20
// Running minimum:
// 10 5 5 5 5
// Range:
// 0 5 10 10 15
import java.util.*;
public class task2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] max = new int[n];
        int max1 = Integer.MIN_VALUE;
         int range =0;
        System.out.println("Running max");
        for(int i=0;i<n;i++){
            
           max1 = Math.max(max1,arr[i]);
           max[i] = max1;
           
        System.out.print(max[i]+" ");
        }
        System.out.println(" ");
        int [] min = new int [n];
         int  min1 = Integer.MAX_VALUE;
         System.out.println("Running min");
           for(int i=0;i<n;i++){
            
           min1 = Math.min(min1,arr[i]);
           min[i] = min1;
           
        System.out.print(min[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Range");
        for(int i =0;i<n;i++){
            range = max[i]-min[i];
            System.out.print(range+" ");
        }
        
    }
}
//Problem Statement
// A weather station records the temperature every hour. For  
// each hour, print the lowest temperature recorded from the first hour up to the current hour.
import java.util.*;
public class RunningMin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            min =Math.min(min,arr[i]);
            System.out.print(min+" ");
        }
    }
}
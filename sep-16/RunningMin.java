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
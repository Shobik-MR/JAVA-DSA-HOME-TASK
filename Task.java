import java.util.*;
public class Task{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int [] arr= new int[n];
        int first =-1;
        int last =-1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int right = arr.length;
        int left = 0;
       while(right>-1 && left < n){
        if(k==arr[left]&& first==-1){
            first = left;
        }
        else{
            left++;
        }
        if(k==arr[right] && last==-1){
            last = right;
        }
        else{
            right--;
        }
        if(first!=-1 && last!=-1){
            break;
        }
       }
       System.out.print(first +" "+last);
    }
}
import java.util.*;
public class Linear{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int [] arr = new int[n];
     for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
     }   
     int index = -1;
     int target = sc.nextInt();
     for(int i=0;i<n;i++){
        if(arr[i]==target){
            index = target;
            break;
        }
     }
     System.out.print(index);
    }
}
//time complexity
// best case O(1)
//worst case O(n)
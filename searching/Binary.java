import java.util.*;
public class Binary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = -1;
        int left =0;
        int high = arr.length-1;
        while(left<=high){
            int mid = left+(high-left)/2;
            if(arr[mid] == target){
                index = target;
                break;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.print(index);
    }
}
// }
// time complixity
// best case = O(1)
// worst case = O(logn)
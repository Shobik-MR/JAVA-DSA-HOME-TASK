import java.util.*;
public class IndexRearrange{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
            
        }
        int [] ind = new int[n];
         int [] result = new int[n];
        for(int i=0;i<n-1;i++){
            ind[i] = sc.nextInt();
            result[ind[i]] = arr[i];   
        }
        System.out.print(Arrays.toString(result));
    }
}
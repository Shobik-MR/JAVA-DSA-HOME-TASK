import java.util.*;
public class SumUnique{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       HashMap<Integer,Integer> sum = new HashMap<>();
       int unique =0;
       for(int x : arr){
        sum.put(x,sum.getOrDefault(x,0)+1);
       }
       for(int x:arr){
         if(sum.get(x)==1){
          
            unique +=x;
         }
       }
       System.out.print(unique);
    }
}
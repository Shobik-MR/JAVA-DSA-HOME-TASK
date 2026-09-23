import java.util.*;
public class Max_COnsecutive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
    
    }
    int j=0;
    int zero=0;
    int max=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            zero++;
        }
        while(zero>1){
            if(arr[j]==0){
                zero--;
            }
            j++;
        }
        max = Math.max(max,i-j+1);
    }
    System.out.print(max);
    }
}
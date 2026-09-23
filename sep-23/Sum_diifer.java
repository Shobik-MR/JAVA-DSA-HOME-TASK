
import java.util.*;

public class Sum_diifer{
	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int [] arr = new int[n];
	
	for(int i=0;i<n;i++){
	    arr[i] = sc.nextInt();
	}
	int min =0;
	int sum =0;
	int count =0;
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
           count = min;
	        if(arr[i]+arr[j]<=k){
	            sum = arr[i]+arr[j];
	            min = Math.min(min,k-sum);
	            
	        }
    	        
    	        if(sum-k==min){
    	           
    	            System.out.println("closest pair : "+arr[i]+","+arr[j]);
    	            
    	            break;
    	        }
             
	    }
      
	}
      System.out.println("Difference"+min);
    	            System.out.println("Sum"+ sum);
	}
}
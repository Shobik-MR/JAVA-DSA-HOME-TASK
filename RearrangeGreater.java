import java.util.*;
public class RearrangeGreater{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] stream = Array.stream(arr).sorted().toArray();
        IntStream.range(0,stream.length).forEach(i->{
            if(i%2==0){
                System.out.print(stream[stream.length-1-i/2 +" "]);
            }
            else{
                System.out.print(stream[i/2+" "]);
            }
        });

    }
}
import java.util.*;
public class Rearrange{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // input the size
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();// getting the input
            if(x>=0){
                positive.add(x);//separte positive
            }
            else{
                negative.add(x);//separate negative
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int p =0;
        int deg =0;
        // alternate the number
        while(p<positive.size() && deg< negative.size()){
           result.add(positive.get(p));
           result.add(negative.get(deg));
                          //time complexity = O(n)
                          //space complexity=O(n)
           p++;
           deg++;
        }
        while(p<positive.size()){
            result.add(positive.get(p));
            p++;
        }
        while(deg<negative.size()){
            result.add(negative.get(deg));
            deg++;
        }
    System.out.println(result);
    sc.close();
    }
}
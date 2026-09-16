import java.util.*;
public class Commanel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int [] nums1 = new int[n];
        int [] nums2 = new int[a];
        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            nums2[i] = sc.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int count1 =0;
        int count2 =0;
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        for(int x:nums1){
            if(set2.contains(x)){
                count1++;
            }
        }
        for(int x:nums2){
            if(set1.contains(x)){
                count2++;
            }
        }
        int [] result ={count1,count2};
        System.out.println(Arrays.toString(result));
    }
}
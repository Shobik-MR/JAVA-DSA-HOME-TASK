import java.util.*;
public class ListDupilcate{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int Index = Math.abs(nums[i])-1;
            if(nums[Index]<0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[Index] = -nums[Index];
            }
        }   //time complexity = O(n);
        // space complexity =O(n)
        System.out.print(result);
    }
}
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     result.add(nums[i]);
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }
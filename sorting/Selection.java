public class Selection{
    public static void main(String [] args){
        int [] arr = {5,4,3,2,11};
        for(int i=0;i<arr.length;i++){
            int mid = i;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[j]<arr[mid]){
                  mid = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mid];
            arr[mid] = temp;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
// }
// Time -> O(n2)
// Space -> O(1)
public class Bubble{
    public static void main(String [] args){
        int [] arr = {2,4,6,44,6};
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
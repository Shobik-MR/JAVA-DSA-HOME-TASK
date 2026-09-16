import java.util.*;
public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String  Str = sc.nextLine();

     int left = 0;
     int right = Str.length()-1;
     char [] arr = Str.toCharArray();
     while(left<right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
     }
    System.out.print(arr);
}
}
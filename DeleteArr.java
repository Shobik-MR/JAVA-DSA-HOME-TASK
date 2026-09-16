import java.util.*;
public class DeleteArr{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int [] arr = new int[n];
int index =-1;
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
  
}
for(int i=0;i<n;i++){
      if(arr[i]==k){
      index = i;
      break;
    }
}
if(index!=-1){
for(int i=index;i<n-1;i++){
    arr[i]= arr[i+1];
}
n--;
}


// int [] result = new int[arr.length-1];
// for(int i=0,j=0;i<n;i++){
//     if(k==arr[i]){
//         continue;
//     }
//     result[j]=arr[i];
//     j++;
// }
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
}

}
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Search{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []value = s.trim().split("\\s+");
        
        Node head = null;
        Node tail = null;
        for(String x : value){
            int data = Integer.parseInt(x);
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
                
            }
        }
        int target = 4;
        Node temp = head;
        int position =1;
        while(temp != null){
            if(temp.data == target){
                System.out.println(position);
                return;
            }
          
            temp = temp.next;
              position++;
        }
        System.out.println("Element not found");
        sc.close();
    }
}
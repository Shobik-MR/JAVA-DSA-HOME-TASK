import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linked{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String [] value = input.trim().split("\\s+");
    Node head = null;
    Node tail = null;
    for(String x : value){
        int data = Integer.parseInt(x);
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    Node temp = head;
    int count =0;
    while(temp!=null){
        System.out.print(temp.data+"->");
        count++;
        temp=temp.next;
    }
    
    System.out.println("null");
    System.out.println("length = "+ count);
    sc.close();
   }
}
import java.util.*;
class prog120{
    static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Node head=new Node(10,null);
       Node node1=new Node(20,null);
       Node node2=new Node(30,null);
       Node node3=new Node(40,null);
       head.next=node1;
       node1.next=node2;
       node2.next=node3;
       Node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
    }
}

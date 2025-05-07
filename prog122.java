import java.util.*;
public class prog122 {
    Node head;

public static class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public void appendNode(int new_data){
    Node new_node=new Node(new_data);
    if(head==null){
        head=new_node;
        return;
    }
    Node last=head;
    while(last.next!=null){
        last=last.next;

    }
    last.next=new_node;

}
void printList(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}


public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    prog122 li=new prog122();
    for(int i=1;i<=5;i++){
        int val=sc.nextInt();
        li.appendNode(val);
    }
    System.out.println("--Linked List--");
    li.printList();
}

}

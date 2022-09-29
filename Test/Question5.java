
import java.util.*;
import java.io.*;
class linkedList{
    Node head;
}
class Node{
    int val;
    Node next;

    Node(int d){
        val=d;
        next=null;
    }

}

public class Question5 {
    public static void main(String args[]) {
        //taking user input
        Scanner sc=new Scanner(System.in);
        //taking length of linkedlist
        int length=sc.nextInt();
        Node head=null, curr=null;
        for(int i=0; i<length; i++){
            if(curr==null){
                curr=new Node(sc.nextInt());
                head=curr;
            }
            else{
                Node t=new Node(sc.nextInt());
                curr.next=t;
                curr=curr.next;
            }
        }
        head=findMid(head);
        print(head);
    }

    static Node findMid(Node head){
        //head is null means empty linked list
        if(head == null){
            return null;
        }
        //when there is single node
        if(head.next==null){
            return head;
        }
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            //moving slow pointer one step
            slow=slow.next;
            //moving fast pointer by two steps
            fast=fast.next.next;

        }
        return slow;

    }

    static void print(Node head){
        if(head==null){
            System.out.println("");
            return;
        }
        System.out.print(head.val+" ");
        print(head.next);
    }
}



package com.company;
import java.util.Scanner;
public class Main{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("enter data:");
            data = sc.nextInt();
            Node new_node=new Node(data);
            if(head==null)
            {
                head=new_node;
                tail=new_node;
                new_node.next=head;
            }
            else
            {
                new_node.next=head;
                head=new_node;
                tail.next=head;
            }
            System.out.print("Do u want to add more data.If Yes,press 1:");
            n=sc.nextInt();
        }
        while(n==1);
    }
    public void traverser()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("LL does not exist");
        }
        else
        {
            do
                {
                   System.out.print(temp.data+" ");
                   temp=temp.next;
                }
            while(temp!=head);
            }
        }


    public static void main(String[] args) {
        Main L1=new Main();
        L1.creation();
        L1.traverser();
	// write your code here
    }
}

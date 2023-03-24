// Java Program for Singly Linked List Insertion at End Program in Java
import java.lang.*;

class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public void insertEnd(int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);

        // if Linked List was empty, entering first node
        if(head==null)
        {
            head = newNode;
            System.out.println(newNode.data + " inserted");
            return;
        }

        // required to traverse the Linked List
        Node temp = head;

        // traverse till the last node in Linked List
        while(temp.next!=null)
            temp = temp.next;

        // assigning the current last node's next to this newNode
        // thus newNode becomes the last node in Linked List
        temp.next = newNode;
        System.out.println(newNode.data + " inserted");

    }


    public void display()
    {
        System.out.println();
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
public class Main
{
public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insertEnd(50);
        ll.insertEnd(40);
        ll.insertEnd(30);
        ll.insertEnd(20);
        ll.insertEnd(10);

        ll.display();

    }
}

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
    public Node insertBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("inserted "+data);
        return head;
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

        ll.insertBeginning(5);
        ll.insertBeginning(4);
        ll.insertBeginning(3);
        ll.insertBeginning(2);
        ll.insertBeginning(1);

        ll.display();

    }
}

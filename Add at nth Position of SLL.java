import java.lang.*;

class LinkedList {
    Node head;

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x)
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

        return head;
    }

    public void insertAfter(int n,int data)
    {
        int size = calcSize(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > size)
        {
            System.out.println("Can't insert\n");

        }
        else
        {
            Node newNode = new Node(data);
            // required to traverse
            Node temp = head;

            // traverse to the nth node
            while(--n > 0)
                temp=temp.next;

            newNode.next= temp.next;
            temp.next = newNode;
        }
    }

    public void display()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public int calcSize(Node node){
        int size = 0;
        while(node!=null){
            node = node.next;
            size++;
        }
        return size;
    }
	
}
    class Main{
    public static void main(String args[])
    {
        LinkedList listObj = new LinkedList();

        listObj.insertBeginning(15);
        listObj.insertBeginning(10);
      
        listObj.display();

        listObj.insertAfter(1,100);
		listObj.insertAfter(2,200);

        listObj.display();
    }
}

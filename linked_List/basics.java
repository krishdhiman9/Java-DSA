package linked_List;
class Node {
    int data;
    Node next;

    //constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//create class
class linkedList{
    Node head;
}
public class basics {
    public static void main(String[] args) {

        Node n1 = new Node(19);
        Node n2 = new Node(50);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;
        //Output
        System.out.println(n1.next.data);

        //object
        linkedList n = new linkedList();

        n.head=n1;
        System.out.println(n.head.data);
    }
}
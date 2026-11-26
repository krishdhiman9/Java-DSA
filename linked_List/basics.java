package linked_List;
class node{
    int data;
    node next;

    //constructor
    node(int data){
        this.data= data;
        this.next=null;
    }
}

class Head{
    node head;
}

public class basics{
public static void main(String[] args) {
    //seperated nodes
    node n1=new node(10);
    node n2 = new node(20);
    node n3 = new node (30);

    //nodes connected
    n1.next=n2;
    n2.next=n3;

    //head
    Head h1= new Head();
    h1.head=n1;
    System.out.println(h1.head.data);

    //add new nodes data at the begining.
    node newnode = new node(3);
    newnode.next = h1.head;
    h1.head=newnode;

    //output
    System.out.println(h1.head.data);
}
}
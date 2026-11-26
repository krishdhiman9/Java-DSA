package linked_List;
class node{
    int data;
    node next;

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

    node n1=new node(10);
    node n2 = new node(20);
    node n3 = new node (30);

    n1.next=n2;
    n2.next=n3;


    Head h1= new Head();
    h1.head=n1;

    System.out.println(h1.head.data);

    node newnode = new node(3);
    newnode.next = h1.head;
    h1.head=newnode;

    System.out.println(h1.head.data);
}}
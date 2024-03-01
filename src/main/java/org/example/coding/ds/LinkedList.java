package org.example.coding.ds;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while (n.next!=null){
               n = n.next;
            }
            n.next = node;
        }

    }

    public void show(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAtAnyLocation(int index , int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0)
            insertAtStart(data);
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAtIndex(int index ){
        if(index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println(n1.data +" : is deleted");
            n1=null;

        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(18);
        linkedList.insert(25);
        linkedList.insert(12);
        linkedList.insertAtStart(67);
        linkedList.insertAtAnyLocation(2,45);
        linkedList.deleteAtIndex(2);
        linkedList.show();

    }
}


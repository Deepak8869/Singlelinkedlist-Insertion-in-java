import java.util.LinkedList;

public class implmwntation {

    public static class Node{
        int data;
        Node next; 

        Node(int data){
            this.data = data;
        }
    }
   
    public static class linkedList{
         Node head = null;
         Node tail = null;

         void insertatend(int val){
            Node temp = new Node(val);
            if(head == null){
                head= temp;
                
            }
            else{
                tail.next = temp;
               
            }
            tail = temp;
         }
         void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp  = temp.next;
            }
         }
         int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
               count++;
                temp  = temp.next;
         }
         return count;
    }
}
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.display();
        System.out.println();
        System.out.println("Size of linked list is " + ll.size());

    }
}



public class Insertatbeginning {
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

        void Insertatbeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
                
            }
           

        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp  = temp.next;
            }  
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.Insertatbeginning(1);
        ll.Insertatbeginning(2);

        ll.display();
        
    }
}

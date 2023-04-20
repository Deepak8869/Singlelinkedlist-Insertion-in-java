public class Insertatgivenindex {
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


        void InsertAtGivenIndex(int idx,int val){
            Node temp = new Node(val);
            Node t = head;
            for(int i=0;i<=idx-1;i++){
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
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
        ll.InsertAtGivenIndex(1, 2);

        ll.display();
    }
}

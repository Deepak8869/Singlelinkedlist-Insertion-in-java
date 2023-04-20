public class findlengthoflinedlist {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static int length(Node f){
        int count = 0;
        while(f != null){
            count++;
            f = f.next;

        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(1);
        Node d = new Node(1);


        a.next = b;
        b.next = c;
        c.next = d;
        
        System.out.println(length(a));
    }
}

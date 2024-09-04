public class LinkedList
{
    class Node{
        int data;
        Node pointer;

        public Node(int data){
            this.data=data;
            pointer=null;
        }
    }

    Node head;

    void addElementBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{

        }
    }
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            // Store the next node
            next = current.pointer;

            // Reverse the current node's pointer
            current.pointer = prev;

            // Move the pointers one position ahead
            prev = current;
            current = next;
        }

        // Update the head to be the last node we visited
        head = prev;

        // Print the reversed list
        print();
    }
    void reverse_C(){
        reverseHelper(head,head.pointer);
    }
    void reverseHelper(Node current,Node next){
        if(next == null){
            head = current;
            return;
        }
        reverseHelper(next,next.pointer);
        next.pointer = current;
        current.pointer=null;

    }

    int size(){
       int count=0;
       Node current = head;
       while(current!=null){
           count++;
           current=current.pointer;
       }
       return count;
    }


    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.pointer;
        }
        System.out.println("null");
    }


    void addElementEnd(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        else{
            Node current = head;
            while (current.pointer != null) {
                current = current.pointer;
            }
            current.pointer = newnode;

        }
    }

    void replaceElementAtIndex(int position, int data){
        Node newNode= new Node(data);
        Node current = head;
        for(int i=0;i<position-1;i++){
            if(current.pointer!=null){
                current = current.pointer;
            }
            else{
                System.out.println("Error reached end of linked list!");
                break;
            }
        }
        newNode.pointer=current.pointer;
        current.pointer=newNode;
    }

    void printElements(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.pointer;
        }
    }

    void addAlternateLinked(LinkedList ll1, LinkedList ll2){
        Node temp1 = ll1.head.pointer;
        Node temp2 = ll2.head.pointer;
        int min=0;
        

        ll1.head.pointer = ll2.head.pointer;
        while(ll1.head.pointer.pointer!=null && ll2.head.pointer.pointer!=null){
            ll2.head.pointer=temp1;
            temp1 = temp1.pointer;
            ll1.head.pointer.pointer = temp2;
            temp2 = temp2.pointer;
            min--;
        }

    }

    void removeElementAtIndex(int position,int data){
        Node newNode= new Node(data);
        Node current = head;
        for(int i=0;i<position-1;i++){
            if(current.pointer!=null){
                current = current.pointer;
            }
            else{
                System.out.println("Error reached end of linked list!");
                break;
            }
        }
        current.pointer=current.pointer.pointer;

    }

    void reverseLinkedList(){
        Node current=head;
        Node prev = null;
        while(current.pointer!=null){
//            current = head.pointer;
//            head.pointer = prev;
//            prev = head;
//            head = current;
            head = current.pointer;
            current.pointer=prev;
            prev=current;
            current = head;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList llObj1 = new LinkedList();
        LinkedList ll0bj2 = new LinkedList();
//        llObj.addElementBeginning(10);
//        llObj.addElementEnd(20);
//        llObj.addElementEnd(30);
//        llObj.addElementEnd(40);
//        llObj.printElements();
////        llObj.replaceElementAtIndex(2,11);
////        llObj.removeElementAtIndex(0,1);
//    llObj.reverse_C();
//    llObj.print();
        llObj1.addElementEnd(1);
        llObj1.addElementEnd(2);
        llObj1.addElementEnd(3);
        llObj1.addElementEnd(4);
        llObj1.printElements();
        System.out.println();
//        ll0bj2.addElementEnd(5);
//        ll0bj2.addElementEnd(6);
//        ll0bj2.addElementEnd(7);
//
//        llObj1.addAlternateLinked(llObj1,ll0bj2);
        llObj1.reverseLinkedList();
        llObj1.printElements();
    }
}

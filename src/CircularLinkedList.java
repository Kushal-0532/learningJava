public class CircularLinkedList {

    Node head;

    void addElementsEnd(int n){
        Node newNode = new Node(n);
        if(head==null){
            head = newNode;
            head.next=head;
        }
        else{
            Node current = head.next;
            while(current.next!=head){
                current=current.next;
            }
            current.next = newNode;
            newNode.next=head;
        }
    }

    void printElements(){
        Node current = head;
        while(current.next!=head){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }

    void addElementAtStart(int n){
        Node current = head;
        Node newNode = new Node(n);
        newNode.next=head;
        while(current.next!=head){
            current = current.next;
        }
        current.next=newNode;
        head = newNode;
    }

    void addElementAtIndex(int index, int n){
        Node current = head;
        Node newNode = new Node(n);
        for(int i=0;i<(index%size())-1;i++){
            current=current.next;
        }
        Node temp = current.next;
        current.next = newNode;
        newNode.next=temp;
    }

    void removeElementAtEnd(){
        Node current = head;
        while(current.next.next!=head){
            current = current.next;
        }
        current.next=head;
    }

    void removeElementAtStart(){
        Node temp = head.next;
        Node current = head;
        while(current.next!=head){
            current = current.next;
        }
        current.next = temp;
        head = temp;
    }

    int size(){
        int count=0;
        Node current = head.next;
       while(current!=head){
           count++;
           current = current.next;
       }
       count++;
       return count;
    }

    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        obj.addElementsEnd(1);
        obj.addElementsEnd(2);
        obj.addElementsEnd(3);
        obj.addElementsEnd(4);
        obj.addElementsEnd(5);
        obj.removeElementAtStart();
        obj.printElements();
    }


}


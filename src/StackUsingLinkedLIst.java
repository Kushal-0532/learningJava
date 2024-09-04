public class StackUsingLinkedLIst
{
    Node head;
    int count;

    public StackUsingLinkedLIst(int count) {
        this.count = count;
    }

    void push(int n){
        Node newNode = new Node(n);
        if(head==null){
            head=newNode;
        }
        else{
            if(isFull()){
                System.out.println("Maximum size reached!");
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
    }

    void printElements(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Empty Stack!");
        }
        else{
            System.out.println("Popped: "+head.data);
            head = head.next;
        }

    }

    void top(){
        System.out.println("Current top: "+head.data);
    }

    boolean isEmpty(){
        return head == null;
    }

    boolean isFull() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count--;
            if (count == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public static void main(String[] args) {
        StackUsingLinkedLIst obj = new StackUsingLinkedLIst(5);
        obj.push(1);
        obj.push(2);
        obj.printElements();
        obj.pop();
        obj.top();
        obj.printElements();
    }
}

public class StaticWIthArray
{
    static int max;
    int Top=-1;
    int[] stack;
    public StaticWIthArray(int max) {
        this.max = max;
        this.stack = new int[max];
    }

    void pushIntoStack(int element){
        if(Top+1<(max)){
            stack[Top+1] = element;
            Top++;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    void popFromStack(){
        if(Top>=0){
            Top--;
            System.out.println("Element "+stack[Top+1]+" popped out");
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    void printElements(){
        for(int i=0;i<Top+1;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    void printPeak(){
        System.out.println("Peak element is "+stack[Top]);
    }

    public static void main(String[] args) {
        StaticWIthArray obj = new StaticWIthArray(5);
        obj.pushIntoStack(1);
        obj.pushIntoStack(2);
        obj.pushIntoStack(3);
        obj.pushIntoStack(4);
        obj.pushIntoStack(5);
        obj.printElements();
        obj.popFromStack();
        obj.printElements();
        obj.pushIntoStack(6);
        obj.printElements();
        obj.popFromStack();
        obj.printElements();
    }
}

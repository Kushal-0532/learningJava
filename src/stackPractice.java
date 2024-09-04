// Creating a stack using an array

import java.util.Stack;

public class stackPractice
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}

class ArrayStack{
    int[] stack;
    int fistElement;
    int sizeOfElement;

    public ArrayStack(int sizeOfElement){
        this.sizeOfElement=sizeOfElement;

    }
}



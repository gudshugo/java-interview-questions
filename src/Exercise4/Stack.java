package Exercise4;

import java.util.Arrays;
import java.util.Collections;

/**
 * Stack implementation from scratch.
 *
 * Methods implemented:
 *
 * isEmpty() - verifies if the stack is empty.
 * isFull() - verifies if the stack is full.
 * push() - pushes new elements onto the stack.
 * pop() - removes the element placed on top of the stack.
 * size() - returns the size of the stack.
 * getMax() - returns the highest number inserted into the stack.
 * print() - print the numbers inserted into the stack.
 *
 */

public class Stack {

    private final int[] elements;
    private int top;
    private final int capacity;

    Stack(int size){
        elements = new int[size];
        capacity = size;
        top = -1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public Boolean isFull(){
        return top == capacity-1;
    }

    public void push(int n){

        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }

        System.out.println("Inserting: " + n);
        elements[++top] = n;

    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }

        return elements[top--];

    }

    public int size(){
        return top+1;
    }

    public int getMax(){
        Arrays.stream(elements)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray();
        return top+1;
    }

    public void print(){
        for(int i=0; i<=top; i++){
            System.out.println(elements[i] + ", ");
        }
    }

    public static void main(String[] args){

        Stack stack = new Stack(6);

        stack.push(6);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(4);

        stack.print();

        System.out.println("Max value of the stack: " + stack.getMax());

    }

}

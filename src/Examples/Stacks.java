package Examples;

import java.util.EmptyStackException;

public class Stacks<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    //Pop method
    public T pop(){
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }


    public void push(T item){
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    //Returns the top item on stack
    public T peek(){
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    //Checks if stack is empty
    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String[] args) {
        Stacks<String> s = new Stacks<String>();
    }

}

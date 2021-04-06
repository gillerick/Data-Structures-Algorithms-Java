package Examples;

import java.util.NoSuchElementException;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    //Adds an item to the end of the queue
    public void add(T item){
        QueueNode<T> t = new QueueNode<T>(item);
        if (last != null){
            last.next = t;
        }

        last = t;
        if (first == null){
            first = last;
        }
    }

    //Removes the first item in the queue
    public T remove(){
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.data;
        if (first == null){
            last = null;
        }
        return data;
    }

    //Returns the top of the queue
    public T peek(){
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    //Returns true if queue is empty
    public boolean isEmpty(){
        return first == null;
    }
}

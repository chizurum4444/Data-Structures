package queue;

public class LinkedListQueueNode<T> {
    private T data;
    private LinkedListQueueNode<T> next;
    private LinkedListQueueNode<T> prev;
    
    LinkedListQueueNode() {
        next = null;
        prev = null;
        data = null;
    }
    
    LinkedListQueueNode(T data) {
    
    }
    
    LinkedListQueueNode(T data, LinkedListQueueNode<T> next, LinkedListQueueNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    public void setNextNode(LinkedListQueueNode<T> next) {
        this.next = next;
    }
    
    public void setPrevNode(LinkedListQueueNode<T> prev) {
        this.prev = prev;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public LinkedListQueueNode<T> getNextNode() {
        return next;
    }
    public LinkedListQueueNode<T> getPrevNode() {
        return prev;
    }
    
    public T getData() {
        return data;
    }
    
    }
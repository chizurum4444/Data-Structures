package queue;

// YOUR CODE GOES HERE
 public class LinkedListQueue<T> {
        private int size;
        private LinkedListQueueNode<T> head;
        private LinkedListQueueNode<T> tail;
         
        public void enqueue(T data) {
            LinkedListQueueNode<T> newnode = new LinkedListQueueNode<T>();
             if(tail==null){
                    head=newnode;
                    tail=newnode;
                }else{
                    newnode.setPrevNode(tail);
                    tail.setNextNode(newnode);
                    tail=newnode;
                }
            size++;
        }

        public T dequeue() {
            if (isEmpty()) {
                return null;
            }
    
            T data = this.head.getData();
    
            this.head = this.head.getNextNode();
    
            size--;
    
            return data;
        }
    
        
    public int size(){ 
        return size;
    } 

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
}    
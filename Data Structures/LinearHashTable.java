public class LinearHashtable<T> extends Hashtable<T> {
    public LinearHashtable(int capacity) {
        super(capacity);
    }

    public int rehash(int previousHash) {

        // YOUR CODE GOES HERE
                //xmod array list size
                previousHash+=1;
                int newIndex = previousHash % capacity;
                return newIndex;
    }
}

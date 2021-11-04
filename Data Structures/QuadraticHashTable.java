public class QuadraticHashtable<T> extends Hashtable<T> {
    public QuadraticHashtable(int capacity) {
        super(capacity);
    }

    public int rehash(int previousHash) {

        // YOUR CODE GOES HERE
        previousHash*=previousHash;
        int newIndex = Math.floorMod(previousHash , capacity);
        return newIndex;

    }
}

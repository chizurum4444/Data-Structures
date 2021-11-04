package hashing;
import java.util.ArrayList;
import java.util.Collection;

public class ChainingHashTable implements HashTable {
    String key;
    Student value;
    ChainingHashTable next;
 
    /* Constructor */
    ChainingHashTable(String key, int value) 
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public class HashTable{
        private int TABLE_SIZE;
        private int size; 
        private ChainingHashTable[] table;
     
         /* Constructor */
        public HashTable(int ts) 
        {
            size = 0;
            TABLE_SIZE = ts;
            table = new ChainingHashTable[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                table[i] = null;
        } 

        private int myhash(String x )
        {
            int hashVal = x.hashCode( );
            hashVal %= TABLE_SIZE;
            if (hashVal < 0)
                hashVal += TABLE_SIZE;
            return hashVal;
        }

        public Student get(String key) {
            int hash = (myhash( key ) % TABLE_SIZE);
            if (table[hash] == null)
                return null;
            else 
            {
                ChainingHashTable entry = table[hash];
                while (entry != null && !entry.key.equals(key))
                    entry = entry.next;
                if (entry == null)
                    return null;
                else
                    return entry.value;
            }
        }

    private int hash(String key) {
        final int z = 33;

        int code = 0;
        int factor = 1;
        for (int i = 0; i < key.length(); i++) {
            code += key.charAt(i) * factor;
            factor *= z;
        }
        return Math.abs(code) % hashTable.length;
    }

    public void print(){
        for (int index = 0; index < TABLE_SIZE; index++)
        {
            System.out.print("\nBucket "+ (index + 1) +" : ");
            ChainingHashTable entry = table[index];
            while (entry != null)
            {
                System.out.print(entry.value +" ");
                entry = entry.next;
            }            
        }
    }
}

    @Override
    public Collection<String> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student put(String key, Student newValue) {
        // TODO Auto-generated method stub
        return null;
    }

}

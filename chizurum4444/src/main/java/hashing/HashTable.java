package hashing;

import java.util.Collection;

public interface HashTable {
    Student get(String key);
    Student put(String key, Student newValue);
    Collection<String> keySet();
}

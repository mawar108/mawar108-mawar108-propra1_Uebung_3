package datastructure;

import java.util.*;

public class MultiMap <K, T> {

    private final Map <K,T> storage = new <K,T> HashMap();


    public boolean containsKey(K key) {
        return storage.containsKey(key);
    }


    public Collection <T> getAll(K key) {
        //Collection<T> collect = (Collection <T>) storage.get(key);
        return (Collection<T>) storage.get(key);
    }

    public void put(K key, T value) {
        Collection values = (Collection) storage.get(key);
        if (values == null) {
            values = new ArrayList();
        }
        values.add(value);
        storage.put(key,(T) values);
    }

    public Set<K> keySet() {
        return storage.keySet();
    }

    public Collection <T> values() {
        Collection <T> result = new ArrayList();
        Set <K> keys = keySet();
        for (Object k : keys) {
            result.addAll(getAll((K) k));
        }
        return result;
    }

}

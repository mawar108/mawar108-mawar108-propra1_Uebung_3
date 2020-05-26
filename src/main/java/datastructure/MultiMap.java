package datastructure;

import java.util.*;

public class MultiMap {

    private final Map storage = new HashMap();


    public boolean containsKey(Object key) {
        return storage.containsKey(key);
    }


    public Collection getAll(Object key) {
        return (Collection) storage.get(key);
    }

    public void put(Object key, Object value) {
        Collection values = (Collection) storage.get(key);
        if (values == null) {
            values = new ArrayList();
        }
        values.add(value);
        storage.put(key,values);
    }

    public Set keySet() {
        return storage.keySet();
    }

    public Collection values() {
        Collection result = new ArrayList();
        Set keys = keySet();
        for (Object k : keys) {
            result.addAll(getAll(k));
        }
        return result;
    }

}

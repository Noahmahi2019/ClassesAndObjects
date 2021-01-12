import java.util.HashMap;

public class User <K,V>{
    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private final static int TABLE_SIZE = 32;
    private Entry[] table;

    public User() {
        table = new Entry[TABLE_SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % TABLE_SIZE);
    }

    public void put(K key, V value) {
        int hash = hash(key);
        Entry curr = table[hash];
        if (curr == value) {
            table[hash(key)] = new Entry(key, value);
        } else {
            while (curr.next != null) {
                curr = curr.next;
                curr.getValue();
            }
            curr.next = new Entry(key, value);
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry curr = table[index];
        while (curr != null) {
            if (curr.getKey().equals(key)) {
                return (V) curr.getValue();
            }
            curr = curr.next;
        }
        return null;
    }
    public V remove(K key) {
        int hash = hash(key);
        Entry curr = table[hash];
        if (curr == null) {
            return null;
        }
        if (curr.getKey().equals(key)) {
            V temp = (V) curr.getValue();
            table[hash] = curr.next;
            return temp;
        }
        while (curr.next != null) {
            if (curr.next.getKey().equals(key)) {
                V temp = (V) curr.next.getValue();
                curr.next = curr.next.next;
                return temp;
            }
        }
        return null;
    }

}

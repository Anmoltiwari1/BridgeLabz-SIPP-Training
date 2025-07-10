import java.util.*;

class MyHashMap<K, V> {
    private class Node {
        K key;
        V value;
        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private int size = 16;
    private LinkedList<Node>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) buckets[i] = new LinkedList<>();
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        buckets[index].removeIf(node -> node.key.equals(key));
    }
}

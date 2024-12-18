package java_practice;


import java.util.LinkedList;

class CustomHashMap<K, V> {

    // Entry class to represent a key-value pair
    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int INITIAL_CAPACITY = 16; // Default capacity
    private LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
    }

    private int getBucketIndex(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
        }
        for (Entry<K, V> entry : buckets[bucketIndex]) {
            if ((key == null && entry.key == null) || (key != null && key.equals(entry.key))) {
                entry.value = value; // Update the value if the key already exists
                return;
            }
        }
        buckets[bucketIndex].add(new Entry<>(key, value)); // Add a new key-value pair
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];
        if (bucket != null) {
            for (Entry<K, V> entry : bucket) {
                if ((key == null && entry.key == null) || (key != null && key.equals(entry.key))) {
                    return entry.value;
                }
            }
        }
        return null; // Key not found
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];
        if (bucket != null) {
            bucket.removeIf(entry -> (key == null && entry.key == null) || (key != null && key.equals(entry.key)));
        }
    }

    public void printHashMap() {
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Entry<K, V>> bucket = buckets[i];
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("two", 22); // Update the value for key "two"

        System.out.println("Value for key 'two': " + map.get("two"));
        map.remove("one");
        System.out.println("Value for key 'one': " + map.get("one"));

        System.out.println("All entries in the map:");
        map.printHashMap();
    }
}

package uy.edu.um.prog2.tad.hash;

public interface Hash<K, T> {
    void put(K key, T data);

    void remove(K key);

    boolean contains(K key);
}

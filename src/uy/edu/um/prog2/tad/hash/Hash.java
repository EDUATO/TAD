package uy.edu.um.prog2.tad.hash;

public interface Hash<K, T> {
    void insert(K key, T data);

    void delete(K key);

    T search(K key);
}

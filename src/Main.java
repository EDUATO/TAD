import uy.edu.um.prog2.tad.Hash.HashCerrado;
import uy.edu.um.prog2.tad.linkedlist.ListaCircular;
import uy.edu.um.prog2.tad.linkedlist.ListaDoblementeEncadenada;
import uy.edu.um.prog2.tad.linkedlist.ListaEnlazada;
import uy.edu.um.prog2.tad.queue.MyPriorityQueue;
import uy.edu.um.prog2.tad.queue.MyPriorityQueueImp;
import uy.edu.um.prog2.tad.queue.MyQueue;
import uy.edu.um.prog2.tad.queue.MyQueueImp;
import uy.edu.um.prog2.tad.trees.MyTree;
import uy.edu.um.prog2.tad.trees.Tree;

import java.util.Hashtable;

/**
 * TAD PROGRAM THAT HAS LINKEDLIST, CIRCULARLIST, QUEUE, DOBLE QUEUE, PRIORITY QUEUE
 * AND BINARY TREES MADE IN JAVA
 *
 * Eduardo Delfante, Santiago Onandi
 * **/

public class Main {
    public static void main(String[] args) throws Exception {
        // Lista circular test
        ListaCircular<Integer> listaCirc = new ListaCircular<>();
        listaCirc.add(1);
        listaCirc.add(2);
        listaCirc.printList();
        System.out.println(listaCirc.get(4)); // Al ser una lista circular...

        // Lista enlazada test
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(4);

        // Lista doblemente enlazada test
        ListaDoblementeEncadenada<Integer> listadob = new ListaDoblementeEncadenada<>();
        listadob.add(2);
        listadob.add(3);
        listadob.add(5);
        listadob.remove(1);
        lista.remove(1);
        listadob.printList();
        lista.printList();

        // Lista circular test
        ListaCircular<Integer> lcir = new ListaCircular<>();
        lcir.add(1);
        lcir.add(2);
        lcir.add(3);
        lcir.insert(0, 2);
        lcir.printList();

        // Queue test
        MyQueue<Integer> queue = new MyQueueImp<>();
        queue.enqueue(10);
        queue.enqueue(20);

        // Priority queue test
        MyPriorityQueue<Integer> q = new MyPriorityQueueImp<>();
        q.enqueueWithPriority(1, 2);
        q.enqueueWithPriority(2, 3);
        q.enqueueWithPriority(3, 1);
        q.enqueueWithPriority(4, 2);

        // Trees test
        MyTree<Integer, String> myTree = new Tree<>();
        myTree.insert(1, "Uruguay", null);
        myTree.insert(2, "Argentina", 1);
        myTree.insert(3, "Holanda", 2);
        myTree.insert(4, "Colombia", 1);
        myTree.insert(5, "Ucrania", 4);
        myTree.insert(6, "Rusia", 4);
        myTree.insert(7, "Israel", 3);
        myTree.insert(8, "Afganistan", 3);
        myTree.insert(9, "Palestina",2);
        Integer s = myTree.size();
        System.out.println(s);
        System.out.println(myTree.size());
        System.out.println(myTree.countCompleteElements());
        myTree.porNivel().printList();

        // Pruebas hash
        HashCerrado<Integer, String> hash = new HashCerrado<>(2);
        hash.put(7, "Hola");
        hash.put(2, "ass");
        hash.put(9, "queso");
        hash.put(9, "durazno");
        hash.put(10, "empanada");
        System.out.println(hash.capacity);
        String b = hash.showHash();
        System.out.println(b);
        System.out.println(hash.contains(9));

        Hashtable<Integer, String> hashjava = new Hashtable<>();
        hashjava.put(1, "Hola");
        hashjava.put(1, "jeje");
        System.out.println(hashjava.get(1));
    }
}
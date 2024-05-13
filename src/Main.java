import uy.edu.um.prog2.tad.linkedlist.ListaCircular;
import uy.edu.um.prog2.tad.linkedlist.ListaDoblementeEncadenada;
import uy.edu.um.prog2.tad.linkedlist.ListaEnlazada;
import uy.edu.um.prog2.tad.queue.MyPriorityQueue;
import uy.edu.um.prog2.tad.queue.MyPriorityQueueImp;
import uy.edu.um.prog2.tad.queue.MyQueue;
import uy.edu.um.prog2.tad.queue.MyQueueImp;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaCircular<Integer> listaCirc = new ListaCircular<>();
        listaCirc.add(1);
        listaCirc.add(2);
        listaCirc.printList();
        System.out.println(listaCirc.get(4)); // Al ser una lista circular...


        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.add(1);
        lista.add(2);
        lista.add(4);
        ListaDoblementeEncadenada<Integer> listadob = new ListaDoblementeEncadenada<>();
        listadob.add(2);
        listadob.add(3);
        listadob.add(5);

        //listadob.testAnteriorSiguiente(1);
        //lista.testAnteriorSiguiente(1);

        listadob.remove(1);
        lista.remove(1);
        listadob.printList();
        lista.printList();

        ListaCircular<Integer> lcir = new ListaCircular<>();
        lcir.add(1);
        lcir.add(2);
        lcir.add(3);
        //lcir.insert(0, 2);
        //lcir.printList();
        //lcir.testAnteriorSiguiente(3);

        //Problema6();
        MyPriorityQueue<Integer> q = new MyPriorityQueueImp<>();
        q.enqueueWithPriority(1, 2);
        q.enqueueWithPriority(2, 3);
        q.enqueueWithPriority(3, 1);
        q.enqueueWithPriority(4, 2);
        for (int i = 0; i<q.size(); i++){
            System.out.println(q.dequeue());
        }

    }

    public static void Problema6(){
        ProblemaDeJosefo prob = new ProblemaDeJosefo(100);
        prob.juego(23).printList();
        System.out.println(prob.ganador);
    }
}
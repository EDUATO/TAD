package uy.edu.um.prog2.tad.stack;

public class Nodo<T> {
    private T value;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;


    public Node(T val){
        this.value = val;
    }

    public Node(T val, int priority){
        this.value = val;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnterior() {return anterior;}

    public void setAnterior(Nodo<T> anterior) {this.anterior = anterior;}

    public T getValue() {return value;}

    public void setValue(T value) {this.value = value;}
}

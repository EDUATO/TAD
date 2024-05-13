import uy.edu.um.prog2.tad.linkedlist.ListaEnlazada;

public class ProblemaDeJosefo {
    int numeroIntegrantes;
    int posicion = 1;

    public int ganador;
    ListaEnlazada<Integer> colIntegrantes = new ListaEnlazada<>();
    ListaEnlazada<Integer> listaEliminacion = new ListaEnlazada<>();

    public ProblemaDeJosefo(int cantidad){
        numeroIntegrantes = cantidad;
        agregarIntegrantes();
    }

    private void agregarIntegrantes(){
        // Existen N personas numeradas
        for (int i = 1; i < numeroIntegrantes; i++){
            colIntegrantes.add(i);
        }
    }

    public ListaEnlazada<Integer> juego(int m){
        if (m > numeroIntegrantes){
            throw new IllegalArgumentException("m no puede ser mayor a los integrantes");
        }

        while (numeroIntegrantes > 2){
            for (int i = 0; i<m; i++){
                posicion ++;
                if (posicion >= numeroIntegrantes){
                    posicion = 0;
                }
                else if (posicion <= 0){
                    posicion = numeroIntegrantes;
                }
            }

            listaEliminacion.add(colIntegrantes.get(posicion-1));
            colIntegrantes.remove(posicion-1);
            numeroIntegrantes -= 1;
        }
        colIntegrantes.printList();
        ganador = colIntegrantes.get(0);
        return listaEliminacion;
    }
}

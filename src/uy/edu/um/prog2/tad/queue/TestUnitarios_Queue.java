package uy.edu.um.prog2.tad.queue;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestUnitarios_Queue {
    MyQueue queuePrueba = new MyQueueImp();


    @Test
    public void testEnqueue() {
        queuePrueba.enqueue(10);
        queuePrueba.enqueue(20);
        queuePrueba.enqueue(30);

        // Comprobar el tamaño de la queuePrueba
        assertEquals(3, queuePrueba.size());
    }
    @Test
    public void testDequeue() throws Exceptions.EmptyQueueException {
        queuePrueba.enqueue(10);
        queuePrueba.enqueue(20);
        queuePrueba.enqueue(30);

        Object valor = queuePrueba.dequeue();

        assertEquals(10, valor);
        assertEquals(2, queuePrueba.size());
    }


    @Test
    public void testIsEmpty() {
        MyQueue<Integer> queuePrueba = new MyQueueImp<>();
        assertTrue(queuePrueba.isEmpty());
        queuePrueba.enqueue(10);
        assertFalse(queuePrueba.isEmpty());
    }
}
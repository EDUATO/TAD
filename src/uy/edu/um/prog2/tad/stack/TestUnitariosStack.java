package uy.edu.um.prog2.tad.stack;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestUnitariosStack {
    MyStack<Integer> stackTesteo = new Stack<>();

    @Test
    public void testInsert() {
        stackTesteo.push(1);
        stackTesteo.push(2);
        stackTesteo.push(3);
    }
}

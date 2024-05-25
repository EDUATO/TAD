package uy.edu.um.prog2.tad.trees;
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Unitarios_Tree {
    MyTree<Integer,String>arbolTesteo = new Tree<>();

    @Test
    public void testeoInsertFlujoNormal () throws exceptions.KeyDoesNotExist, exceptions.ChildsAreOccupied, exceptions.WrongArgumentException, exceptions.KeyAlreadyExists {
        arbolTesteo.insert(1,"primero",null);
        arbolTesteo.insert(2,"segundo",1);
        arbolTesteo.insert(3,"tercero",2);
    }
}
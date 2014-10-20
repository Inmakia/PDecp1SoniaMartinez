package library;

import org.junit.Test;

public abstract class GestorBibliotecaTest<T> {

    @Test
    public abstract void testAlta();

    @Test
    public abstract void testBaja();

    @Test
    public abstract void testGetAll();

}

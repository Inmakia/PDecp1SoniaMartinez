package library;

import static org.junit.Assert.*;

import org.junit.Before;

public class GestorLibrosTest extends GestorBibliotecaTest<Libro> {
    
    private GestorLibros gestor;
    private Libro libro;
    
    @Before
    public void data(){
        this.gestor = new GestorLibros();
        this.libro = new Libro("Libro1", "Autor1", 12345);
    }
    

    @Override
    public void testAlta() {
        this.gestor.alta(libro);
        assertTrue(this.gestor.getAll().contains(libro));
        
    }

    @Override
    public void testBaja() {
        this.gestor.alta(libro);
        this.gestor.baja(libro);
        assertFalse(this.gestor.getAll().contains(libro));
    }

    @Override
    public void testGetAll() {
        assertEquals(0, this.gestor.getAll().size());
    }

}

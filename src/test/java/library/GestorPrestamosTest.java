package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class GestorPrestamosTest extends GestorBibliotecaTest<Prestamo>{
    
    private GestorPrestamos gestor;
    private Prestamo prestamo;
    
    @Before
    public void data(){
        this.gestor = new GestorPrestamos();
        this.prestamo = new Prestamo(new Usuario ("Usuario"), new Libro("Libro", "Autor", 12345));
    }

    @Override
    public void testAlta() {
        this.gestor.alta(prestamo);
        assertTrue(this.gestor.getAll().contains(prestamo));
    }

    @Override
    public void testBaja() {
        this.gestor.alta(prestamo);
        this.gestor.baja(prestamo);
        assertFalse(this.gestor.getAll().contains(prestamo));
        
    }

    @Override
    public void testGetAll() {
        this.gestor.alta(prestamo);
        Prestamo prestamo2 = new Prestamo(new Usuario ("Usuario2"), new Libro("Libro2", "Autor2", 54321));
        this.gestor.alta(prestamo2);
        assertEquals(2, this.gestor.getAll().size());
    }


}

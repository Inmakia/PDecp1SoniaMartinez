package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrestamoTest {
    
    private Prestamo prestamo;
    private Usuario usuario;
    private Libro libro;
    
    @Before
    public void data() {
        this.usuario  = new Usuario("Usuario");
        this.libro = new Libro("Titulo", "Autor", 12345);
        this.prestamo = new Prestamo(usuario, libro);
    }

    @Test
    public void testPrestamo() {
        assertEquals(this.usuario, this.prestamo.getUsuario());
        assertEquals(this.libro, this.prestamo.getLibro());
    }

    @Test
    public void testGetFechaInicio() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetFechaFin() {
        fail("Not yet implemented");
    }

}

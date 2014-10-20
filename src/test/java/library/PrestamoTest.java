package library;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class PrestamoTest {
    
    private Prestamo prestamo;
    private Usuario usuario;
    private Libro libro;
    
    @Before
    public void data() {
        Calendar.getInstance().clear(Calendar.DATE);
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
    public void testGetFechaFin() {
        Calendar.getInstance().add(Calendar.DATE, 15);
        assertEquals(Calendar.getInstance(), this.prestamo.getFechaFin());
    }

}

























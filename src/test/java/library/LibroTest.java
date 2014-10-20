package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
    
    private Libro libro;
    
    @Before
    public void data() {
        this.libro = new Libro("Titulo", "Autor", 12345);
    }

    @Test
    public void testLibro() {
        assertEquals("Titulo", this.libro.getTitulo());
        assertEquals("Autor", this.libro.getAutor());
        assertEquals(12345, this.libro.getIsbn());
    }

}

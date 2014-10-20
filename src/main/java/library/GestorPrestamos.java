package library;

import java.util.Iterator;


public class GestorPrestamos extends GestorBiblioteca<Prestamo> {

    public boolean prestado(Libro libro) {
        boolean prestado = false;
        Prestamo actual;
        Iterator<Prestamo> iterador = this.getAll().iterator();
        while (iterador.hasNext() && !prestado) {
            actual = iterador.next();
            prestado = actual.getLibro().equals(libro);
        }
        return prestado;
    }

}

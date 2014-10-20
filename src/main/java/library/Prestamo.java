package library;

import java.util.Calendar;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private Calendar fechaInicio, fechaFin;
    
    public Prestamo (Usuario usuario, Libro libro) {
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }
    
    
}

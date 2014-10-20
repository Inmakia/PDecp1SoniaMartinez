package library;

import java.util.Calendar;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private Calendar fechaInicio, fechaFin;
    
    public Prestamo (Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        Calendar cal = Calendar.getInstance();
        this.fechaInicio = cal;
        cal.add(Calendar.DATE, 15);
        this.fechaFin = Calendar.getInstance();
        cal.clear(Calendar.DATE);
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public Calendar getFechaInicio() {
        return this.fechaInicio;
    }

    public Calendar getFechaFin() {
        return this.fechaFin;
    }
    
    
}

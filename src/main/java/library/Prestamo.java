package library;

import java.util.Calendar;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private Calendar fechaInicio, fechaFin;
    
    public Prestamo (Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = Calendar.getInstance();
        Calendar.getInstance().add(Calendar.DATE, 15);
        this.fechaFin = Calendar.getInstance();
        Calendar.getInstance().clear();
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
    
    @Override
    public String toString() {
        return "Prestamo [ " + this.getLibro().toString() + ", " + this.getUsuario().toString() + " ]";
    }
    
}

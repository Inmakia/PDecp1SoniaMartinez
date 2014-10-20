package library;

import upm.jbb.IO;

public class MainBiblioteca {

    private GestorPrestamos gPrestamos;

    private GestorLibros gLibros;

    private GestorUsuarios gUsuarios;

    public MainBiblioteca() {
        this.gPrestamos = new GestorPrestamos();
        this.gLibros = new GestorLibros();
        this.gUsuarios = new GestorUsuarios();
    }
    
    public void altaLibro(){
        String titulo = IO.in.readString("Título");
        String autor = IO.in.readString("Autor");
        int isbn = Integer.parseInt(IO.in.readString("ISBN"));
        this.gLibros.alta(new Libro(titulo, autor, isbn));
    }
    
    public void altaUsuario() {
        String nombre = IO.in.readString("Nombre de usuario");
        this.gUsuarios.alta(new Usuario(nombre));
    }
    
    public void prestarLibro() {
        Libro libro = (Libro) IO.in.select(gLibros.getAll().toArray());
        Usuario usuario = (Usuario) IO.in.select(gUsuarios.getAll().toArray());
        this.gPrestamos.alta(new Prestamo(usuario, libro));
    }
    
    public void verTodo() {
        IO.out.print("Libros: ");
        for (Libro libro : this.gLibros.getAll()) {
            IO.out.print(libro.toString());
            IO.out.println();
        }
        IO.out.println();
        IO.out.print("Usuarios: ");
        for (Usuario usuario : this.gUsuarios.getAll()) {
            IO.out.print(usuario.toString());
            IO.out.println();
        }
        IO.out.println();
        IO.out.print("Préstamos: ");
        for (Prestamo prestamo : this.gPrestamos.getAll()) {
            IO.out.print(prestamo.toString());
            IO.out.println();
        }
        IO.out.println();
        IO.out.println();
    }

    public static void main(String[] args) {
        IO.in.addController(new MainBiblioteca());
    }

}

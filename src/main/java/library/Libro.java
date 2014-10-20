package library;

public class Libro {

    private String titulo, autor;

    private int isbn;

    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return "Libro [ Título: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", ISBN: " + this.getIsbn() + "]";
    }
}

package library;

import java.util.HashSet;

public abstract class GestorBiblioteca<T> {

    public GestorBiblioteca(){
        
    }
    
    public abstract void alta(T item);
    public abstract void baja(T item);
    public abstract HashSet<T> getAll();
}

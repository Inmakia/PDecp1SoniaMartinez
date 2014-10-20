package library;

import java.util.HashSet;

public abstract class GestorBiblioteca<T> {
    
    private HashSet<T> gestores;

    public GestorBiblioteca(){
        this.gestores = new HashSet<T>();
    }
    
    public void alta(T item) {
        this.gestores.add(item);    
    }
    
    public void baja(T item) {
        assert this.gestores.contains(item);
        this.gestores.remove(item);
    }
    public HashSet<T> getAll() {
        return this.gestores;
    }
}

package library;

public class Usuario {
    
    private String name;
    
    public Usuario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Usuario [ " + this.getName() + " ]";
    }
}

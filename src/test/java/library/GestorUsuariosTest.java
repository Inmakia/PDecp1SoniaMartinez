package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorUsuariosTest extends GestorBibliotecaTest<Usuario> {
    
    private GestorUsuarios gestor;
    private Usuario usuario;
    
    @Before
    public void data() {
        this.gestor = new GestorUsuarios();
        this.usuario = new Usuario("Usuario1");
    }

    @Override
    public void testAlta() {
        this.gestor.alta(usuario);
        assertTrue(this.gestor.getAll().contains(usuario));
    }

    @Override
    public void testBaja() {
        this.gestor.alta(usuario);
        this.gestor.baja(usuario);
        assertFalse(this.gestor.getAll().contains(usuario));
        
    }

    @Override
    public void testGetAll() {
        this.gestor.alta(usuario);
        this.gestor.alta(new Usuario("Usuario2"));
        this.gestor.alta(new Usuario("Usuario3"));
        this.gestor.baja(usuario);
        assertEquals(2, this.gestor.getAll().size());
        
    }


}

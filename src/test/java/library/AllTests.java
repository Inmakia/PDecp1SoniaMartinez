package library;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GestorLibrosTest.class, GestorPrestamosTest.class, GestorUsuariosTest.class,
        LibroTest.class, PrestamoTest.class, UsuarioTest.class})
public class AllTests {

}

package maven_junit_project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class OperacionesTest {

	@Test
	final void sumarTest() 
	{
		int resultado=Operaciones.suma(2, 5);
		int esperado=7;
		assertEquals(esperado, resultado);
	}

}

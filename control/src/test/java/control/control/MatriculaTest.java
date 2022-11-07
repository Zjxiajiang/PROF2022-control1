package control.control;

import static org.mockito.Mockito.*;
import org.junit.Test;
import junit.framework.TestCase;

public class MatriculaTest extends TestCase {
	Matricula t;
	Asignatura a;
	@Test
	public void testVectorAsigNull() {
	   t=new Matricula(null);
	   assertNull(t.vectorAsignaturas);
	}
	@Test 
	public void testSumaImporte() throws Exception {
		Asignatura a= mock(Asignatura.class);
		Asignatura b= mock(Asignatura.class);
		Asignatura c= mock(Asignatura.class);
		when(a.getImporte()).thenReturn(100d);
		when(b.getImporte()).thenReturn(100d);
		when(c.getImporte()).thenReturn(100d);
		t.vectorAsignaturas.add(a);
		t.vectorAsignaturas.add(b);
		t.vectorAsignaturas.add(c);
		assertEquals(300d,t.getImporte());
	}
	
}

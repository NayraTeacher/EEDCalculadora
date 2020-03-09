import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperacionesTests {

	@Test
	@DisplayName(value = "TestSumar -> Resultado al pasar 9+8=17.")
	void testSumar() {
		int sumando1 = 9;
		 int sumando2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 17;
		 int result = instance.sumar(sumando1, sumando2);
		 assertEquals(expResult, result);

	}

	@Test
	void testRestar() {
		int o1 = 9;
		 int o2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 1;
		 int result = instance.restar(o1,o2);
		 assertEquals(expResult, result);

	}
	
	@Test
	@DisplayName(value = "TestRestar -> Resultado al pasar -9-8=-17.")
	void testRestar2() {
		int o1 = -9;
		 int o2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = -17;
		 int result = instance.restar(o1,o2);
		 assertEquals(expResult, result);

	}

	@Test
	void testMultiplicar() {
		int o1 = 9;
		 int o2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 72;
		 int result = instance.multiplicar(o1,o2);
		 assertEquals(expResult, result);
	}

	@Test
	void testDividir() {
		int o1 = 16;
		 int o2 = 8;
		 Operaciones instance = new Operaciones();
		 int expResult = 2;
		 int result = instance.dividir(o1,o2);
		 assertEquals(expResult, result);
	}
	
	@Test
	@DisplayName(value = "TestDividir -> Resultado al pasar 7/0 - error!! .")
	void testDividir0() {
		int o1 = 7;
		 int o2 = 0;
		 Operaciones instance = new Operaciones();
		 int expResult = -1;
		 int result = instance.dividir(o1,o2);
		 assertEquals(expResult, result);
	}

}

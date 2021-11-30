/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AppTest {
    Calculadora c;

    @Before public void setUp() {
        c = new Calculadora();
    }

    @Test public void testSuma() {
        assertTrue(c.suma(2,3)==5);
        assertTrue(c.suma(2.4, 3.2)==5.6);
    }

    @Test public void testResta() {
        assertTrue(c.resta(4,2)==2);
    }

    @Test public void testMultiplica() {
        assertTrue(c.multiplica(5,7)==35);
    }

    @Test public void testDivide() {
        assertTrue(c.divide(12,4)==3);
    }
}
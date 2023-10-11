package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static EcuacionCuadratica ec;

    @BeforeAll public static void setUp() {
        ec = new EcuacionCuadratica(1, 3, 2);
    }

    @Test public void testC() {
        assertTrue(ec.getC()==2);
    }

    @Test public void testDiscriminante() {
        assertTrue(ec.getDiscriminante()==1);
    }

    @Test public void testRaiz1() {
        assertTrue(String.format("%.2f",ec.getRaiz1()).equals("-1.00"));
    }

    @Test public void testRaiz2() {
        assertTrue(String.format("%.2f",ec.getRaiz2()).equals("-2.00"));
    }

}
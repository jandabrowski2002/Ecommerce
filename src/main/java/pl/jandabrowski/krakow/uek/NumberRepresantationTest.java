package pl.jandabrowski.krakow.uek;

import org.junit.Test;

import java.math.BigDecimal;

public class NumberRepresantationTest {
    @Test
    void testDoubleRepresantation(){
        double a = 0.02;
        double b = 0.03;
        double c = b - a;

        System.out.println("double 0.02 - 0.03:");
        System.out.println(c);
        System.out.println(a - b);
    }

    @Test
    void testBigDecimalRepresentation() {
        BigDecimal a = newBigDecimal("0.002");
        BigDecimal b = newBigDecimal("0.002");

    }



}

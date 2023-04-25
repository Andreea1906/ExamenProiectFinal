package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatratTest {

    @Test
    void calculPerimetru() {
        double latura = 0;
        FiguraGeometrica figuraGeometrica = new Patrat(latura);
        assertEquals(0,figuraGeometrica.calculPerimetru());
    }
}
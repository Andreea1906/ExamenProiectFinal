package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DreptunghiTest {

    @Test
    void calculPerimetru() {
        double lungime = 3.2;
        double latime = 4.9;
        FiguraGeometrica figuraGeometrica = new Dreptunghi(lungime,latime);
        assertEquals(16.2,figuraGeometrica.calculPerimetru());
    }
}
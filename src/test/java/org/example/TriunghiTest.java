package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TriunghiTest {
    @org.junit.jupiter.api.Test
    void calculPerimetru() {
        double latura1 = 7;
        double latura2 = 3;
        double latura3 = 1;
        FiguraGeometrica figuraGeometrica = new Triunghi(latura1,latura2,latura3);
        assertEquals(0,figuraGeometrica.calculPerimetru());
    }
}
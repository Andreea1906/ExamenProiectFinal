package org.example;

public class Triunghi implements FiguraGeometrica {
    private double latura1;
    private double latura2;
    private double latura3;

    public Triunghi(double latura1, double latura2, double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public double getLatura1() {
        return latura1;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
    }

    public double getLatura3() {
        return latura3;
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
    }

    @Override
    public double calculPerimetru() {
        double perimetru;
        if (latura1 > 0 && latura2 > 0 && latura3 > 0 && (latura1 + latura2 > latura3) && (latura2 + latura3 > latura1) && (latura3 + latura1 > latura2)) {
            perimetru = latura1 + latura2 + latura3;
        }
        else {
            perimetru = 0;
            System.out.println("Triunghiul nu este valid!");
        }
        return perimetru;
    }
}


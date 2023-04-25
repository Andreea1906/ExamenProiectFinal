package org.example;

public class Patrat implements FiguraGeometrica{

    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculPerimetru() {
        double perimetru;
        if(latura >0){
        perimetru = 4*latura;
    }else {
        perimetru = 0;
        }
        return perimetru;
}
}

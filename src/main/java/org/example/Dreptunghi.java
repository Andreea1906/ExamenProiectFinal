package org.example;

public class Dreptunghi implements FiguraGeometrica{
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    @Override
    public double calculPerimetru() {
        double perimetru;
        if(lungime >0 && latime >0){
         perimetru = 2*(lungime+latime);
    }else {
         perimetru = 0;
        }
        return perimetru;
}
}

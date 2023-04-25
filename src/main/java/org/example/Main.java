package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti optiunea figurii geometrice a carei perimetru doriti sa o calculati: ");
        System.out.println("""
                1. Triunghi\s
                2. Patrat\s
                3. Dreptunghi""");
        int optiune = scanner.nextInt();

        switch (optiune) {
            case 1 -> {
                System.out.println("Introduceti laturile triunghiului: ");
                System.out.println("Latura 1: ");
                double latura1 = scanner.nextDouble();
                System.out.println("Latura 2: ");
                double latura2 = scanner.nextDouble();
                System.out.println("Latura 3: ");
                double latura3 = scanner.nextDouble();
                    FiguraGeometrica figuraGeometrica = new Triunghi(latura1, latura2, latura3);

                    System.out.println("Perimetrul triunghiului cu laturile " + latura1 + ", " + latura2 + ", " + latura3 + " este: " + figuraGeometrica.calculPerimetru());
            }
            case 2 -> {
                System.out.println("Introduceti latura patratului: ");
                System.out.println("Latura patratului: ");
                double latura = scanner.nextDouble();
                FiguraGeometrica figuraGeometrica = new Patrat(latura);
                System.out.println("Perimetrul patratului cu latura " + latura + " este: " + figuraGeometrica.calculPerimetru());
            }
            case 3 -> {
                System.out.println("Introduceti lungimea si latimea dreptunghiului: ");
                System.out.println("Lungimea dreptunghiului: ");
                double lungime = scanner.nextDouble();
                System.out.println("Latimea dreptunghiului: ");
                double latime = scanner.nextDouble();
                FiguraGeometrica figuraGeometrica = new Dreptunghi(lungime, latime);
                System.out.println("Perimetrul dreptunghiului cu lungimea " + lungime + " si latimea " + latime + " este: " + figuraGeometrica.calculPerimetru());
            }
            default -> {
                System.out.println("Optiune invalida!");
                System.exit(0);
            }
        }


    }
}
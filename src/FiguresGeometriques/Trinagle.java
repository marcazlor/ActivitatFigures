package FiguresGeometriques;

import org.jetbrains.annotations.NotNull;

public class Trinagle extends Figures {

    private double base;
    private double alt;

    public Trinagle(double base, double alt) {
        this.base = base;
        this.alt = alt;
    }

    public double areaTriangle(){
        return ((this.base * this.alt)/2);
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public int compareTo(@NotNull Figures o) {
        return 0;
    }
}

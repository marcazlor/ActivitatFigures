package FiguresGeometriques;

import org.jetbrains.annotations.NotNull;

public class Cercle extends Figures {

    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double areaCercle(){
        double res = Math.PI * 2 * this.radi;
        return res;
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

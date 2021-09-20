package FiguresGeometriques;

import org.jetbrains.annotations.NotNull;

public class Cercle extends Figures {

    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    public double area(){
        double res = Math.PI * 2 * this.radi;
        return res;
    }



    @Override
    public int compareTo(@NotNull Figures o) {
        return 0;
    }
}

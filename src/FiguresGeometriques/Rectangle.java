package FiguresGeometriques;

import org.jetbrains.annotations.NotNull;

public class Rectangle extends Figures{

    private double costat1;
    private double costat2;

    public Rectangle(double costat1, double costat2) {
        this.costat1 = costat1;
        this.costat2 = costat2;
    }

    public double areaRectangle(){
        return (costat1*costat2);
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

package FiguresGeometriques;


public abstract class Figures implements Comparable<Figures> {

    public abstract double area();

    public int compareto(Figures f) {
        return (int) Math.round(this.area() - f.area());
    }
}


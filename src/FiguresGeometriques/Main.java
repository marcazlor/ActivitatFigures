package FiguresGeometriques;

import FiguresGeometriques.Figures;
import static FiguresGeometriques.GestorFigures.*;
import FiguresGeometriques.Quadrat;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Trinagle triangle = new Trinagle(2,3);
        Quadrat quadrat = new Quadrat(4);
        Rectangle rectangle = new Rectangle(2,5);
        Cercle cercle = new Cercle(2);

        Figures[] vectorFigures = new Figures[4];

        vectorFigures [0] = triangle;
        vectorFigures [1] = quadrat;
        vectorFigures [2] = rectangle;
        vectorFigures [3] = cercle;

        double res = suma(vectorFigures);
        sort(vectorFigures);
        String lista = Arrays.toString(vectorFigures);

        System.out.println("El resultat de la suma de totes les arees es: " + res + " y su orden es: " + lista);
    }



}
package FiguresGeometriques;

import java.util.Arrays;

public class GestorFigures {

    public static double suma (Figures[] v){
        double res = 0;
        for (Figures f : v){
            res+=f.area();
        }
        return res;
    }

    public static void sort (Figures[] v){
        Arrays.sort(v);
    }
}
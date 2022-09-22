import figures.*;
import java.util.Arrays;

public class GestorFiguras {
    public static void sort (Figura [] v) {
        Arrays.sort(v);
    }
    public static double suma (Figura[] v){
        double ret = 0;
        for (Figura f: v){
            System.out.println(f);
            ret += f.area();
        }
        return ret;
    }
    public static void main (String[] args){
        Figura[] v = new Figura[];
        
        double r = GestorFiguras.suma(v);
        System.out.println("L'àrea total és: " + r);
    }


}

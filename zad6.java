package zad6;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PunktXY {
    private int x;
    private int y;

    //Konstruktor
    public PunktXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Gettery
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Nadpisanie metody toString
    @Override
    public String toString() {
        return "PunktXY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class PunktXYZ extends PunktXY {
    private int z;

    //Konstruktor
    public PunktXYZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    //Getter
    public int getZ() {
        return z;
    }
}

public class zad6 {
    public static void main(String[] args) {
        
        //Stworzenie listy
        List<PunktXYZ> listaXYZ = new ArrayList<>();
        
        //Dodanie punktów w przestrzeni
        listaXYZ.add(new PunktXYZ(6, 4, 1));
        listaXYZ.add(new PunktXYZ(3, 8, 7));
        listaXYZ.add(new PunktXYZ(1, 2, 4));

        //Rzutowanie na płaszczyzne XY
        List<PunktXY> listaXY = listaXYZ.stream()
                .map(punktXYZ -> new PunktXY(punktXYZ.getX(), punktXYZ.getY()))
                .collect(Collectors.toList());

        //Wypisanie wyniku
        for (PunktXY punktXY : listaXY) {
            System.out.println("x: " + punktXY.getX() + ", y: " + punktXY.getY());
        }
    }
}

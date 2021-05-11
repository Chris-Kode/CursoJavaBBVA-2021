package holaMundo;

import archivos.FiguraFileUtil;
import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

import java.util.ArrayList;

public class HolaMundo {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Cuadrado("Cuadrado"));
        figuras.add(new Circulo("Circulo"));

        FiguraFileUtil util = new FiguraFileUtil("datos.txt","C:/Prueba/", figuras);
        util.GenerarArchivo(figuras,"datos.txt","C:/Prueba/");

    }
}

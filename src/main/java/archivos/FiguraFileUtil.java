package archivos;


import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FiguraFileUtil {
    private ArrayList<Figura> figuras;
    private String nombreArchivo;
    private String path;

    public FiguraFileUtil(String nombreArchivo, String path, ArrayList<Figura> figuras){
        this.path = path;
        this.nombreArchivo = nombreArchivo;
        this.figuras = figuras;
    };

    public void GenerarArchivo(ArrayList<Figura> figuras, String nombreArchivo, String path) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(path + nombreArchivo);

            pw = new PrintWriter(fichero);

            for (Figura figura: figuras) {
                int tipo = 0;

                if (figura instanceof Cuadrado){
                    tipo = 1;
                }

                if (figura instanceof  Circulo) {
                    tipo = 2;
                }

                pw.println("{\"tipo\": " + tipo + ",\"nombre\":" + "\"" + figura.getNombre() + "\"" + ",\"valores\":" + "\"" + figura.getValores() + "\"" + "},");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    };

    public void GenerarArchivo(){

    };

    public ArrayList<Figura> LeerFichero(String nombreArchivo, String path){
        return new ArrayList<Figura>();
    };

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

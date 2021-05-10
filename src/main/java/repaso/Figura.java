package repaso;

public abstract class Figura implements Model {
    private static float maximaSuperficie;
    private String nombre;

    public Figura(String pnombre){
        super();
        this.nombre = pnombre;

    }

    public static float getMaximaSuperficie() {
        return maximaSuperficie;
    }

    public static void setMaximaSuperficie(float maximaSuperficie) {
        Figura.maximaSuperficie = maximaSuperficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract float calcularPerimetro();
    public abstract float calcularSuperficie();
    public abstract float getValores();

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return nombre.equals(figura.nombre);
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

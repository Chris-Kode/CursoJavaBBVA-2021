

import java.util.ArrayList;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

public class FiguraTest {
    //pregunta de examen
    //diferencia entre objeto y clase
    //que es clase abstracta
    //Que es interface


    //los tres pasos para trabajar con objetos
    Figura cuadrado ; //1- definicion
    Figura circulo ;

    ArrayList<Figura> figuras;
    @BeforeEach
    public void setUp() throws Exception {
        cuadrado = new Cuadrado("cua1", 10);//2- creacion, 3-asignacion
        circulo  = new Circulo("cir1", 10);

        figuras = new ArrayList<Figura>();
        figuras.add(new Cuadrado("cua1", 10));
        figuras.add(new Circulo("cir1", 10));
        figuras.add(new Cuadrado("cua2", 15));
        figuras.add(new Circulo("cir2", 15));
        figuras.add(new Cuadrado("cua3", 12.5f));
        figuras.add(new Circulo("cir3", 12.5f));


    }

    @AfterEach
    public void tearDown() throws Exception {
        cuadrado = null;
        circulo = null;
        figuras = null;
    }
    //************************************teste del un cuadrado **************
    @Test
    public void testCalcularPerimetro_cuadrado() {
        //valor esperado, metodo a testear, presicion
        Assertions.assertEquals(40, cuadrado.calcularPerimetro(),0.1);
    }

    @Test
    public void testCalcularSuperficie_Cuadrado() {
        Assertions.assertEquals(100, cuadrado.calcularSuperficie(),0.1);

    }

    @Test
    public void testGetValores_cuadrado() {
        Assertions.assertEquals("l=10.0", cuadrado.getValores());
    }

    @Test
    public void testGetNombre_cuadrado(){
        Assertions.assertEquals("cua1",cuadrado.getNombre());
    }

    @Test
    public void testEqualsyHashCode_cuadrado(){
        Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
        Assertions.assertTrue(figuras.contains(cuaPrueba));
    }
    //****************************fin de testeo del un cuadrado *********************

    //************************************teste del un circulo **************
    @Test
    public void testCalcularPerimetro_circulo() {
        //valor esperado, metodo a testear, presicion
        Assertions.assertEquals(62.8f, circulo.calcularPerimetro(),0.1);
    }

    @Test
    public void testCalcularSuperficie_circulo() {
        Assertions.assertEquals(314.1f, circulo.calcularSuperficie(),0.1);

    }

    @Test
    public void testGetValores_circulo() {
        Assertions.assertEquals("r=10.0", circulo.getValores());
    }

    @Test
    public void testGetNombre_circulo(){
        Assertions.assertEquals("cir1",circulo.getNombre());
    }

    @Test
    public void testEqualsyHashCode_circulo(){
        Circulo cirPrueba = new Circulo("cir1", 10);
        Assertions.assertTrue(figuras.contains(cirPrueba));
    }
    //****************************fin de testeo del un circulo *********************



}

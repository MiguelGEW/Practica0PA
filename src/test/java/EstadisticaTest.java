import static org.junit.jupiter.api.Assertions.*;

import MathsData.Estadistica;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class EstadisticaTest {

    // ======================
    // ||TESTS PARA LA MEDIA||
    // ======================

    @Test
    @DisplayName("Media: Números enteros simples")
    void media_NumerosSimples() {
        List<Double> datos = Arrays.asList(10.0, 20.0, 30.0);
        assertEquals(20.0, Estadistica.media(datos), 0.0001);
    }

    @Test
    @DisplayName("Media: Ejemplo del enunciado")
    void media_EjemploEnunciado() {
        List<Double> datos = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, Estadistica.media(datos), 0.0001);
    }

    @Test
    @DisplayName("Media: Valores repetidos")
    void media_ValoresRepetidos() {
        List<Double> datos = Arrays.asList(5.0, 5.0, 5.0, 5.0);
        assertEquals(5.0, Estadistica.media(datos), 0.0001);
    }

    @Test
    @DisplayName("Media: Lista vacía (Edge Case)")
    void media_ListaVacia() {
        List<Double> datos = Collections.emptyList();
        assertEquals(0.0, Estadistica.media(datos), 0.0001);
    }

    @Test
    @DisplayName("Media: Lista nula (Excepción)")
    void media_ListaNula() {
        assertThrows(NullPointerException.class, () -> Estadistica.media(null));
    }

    // ==========================
    // ||TESTS PARA LA VARIANZA||
    // ==========================

    @Test
    @DisplayName("Varianza: Números simples")
    void varianza_NumerosSimples() {
        List<Double> datos = Arrays.asList(2.0, 4.0);
        assertEquals(1.0, Estadistica.varianza(datos), 0.0001);
    }

    @Test
    @DisplayName("Varianza: Ejemplo estándar")
    void varianza_CasoEstandar() {
        List<Double> datos = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals(0.6666, Estadistica.varianza(datos), 0.0001);
    }

    @Test
    @DisplayName("Varianza: Un solo elemento (Edge Case)")
    void varianza_UnElemento() {
        List<Double> datos = Arrays.asList(10.0);
        assertEquals(0.0, Estadistica.varianza(datos), 0.0001);
    }

    @Test
    @DisplayName("Varianza: Lista vacía")
    void varianza_ListaVacia() {
        List<Double> datos = Collections.emptyList();
        assertTrue(Double.isNaN(Estadistica.varianza(datos)));
    }

    @Test
    @DisplayName("Varianza: Lista nula (Excepción)")
    void varianza_ListaNula() {
        assertThrows(NullPointerException.class, () -> Estadistica.varianza(null));
    }

    // ==================================
    // ||TESTS PARA LA DESVIACIÓN TÍPICA||
    // ==================================

    @Test
    @DisplayName("Desviación Típica: Números simples")
    void desviacionTipica_NumerosSimples() {
        List<Double> datos = Arrays.asList(2.0, 4.0);
        assertEquals(1.0, Estadistica.desviacionTipica(datos), 0.0001);
    }

    @Test
    @DisplayName("Desviación Típica: Ejemplo estándar")
    void desviacionTipica_CasoEstandar() {
        List<Double> datos = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals(0.81649, Estadistica.desviacionTipica(datos), 0.0001);
    }

    @Test
    @DisplayName("Desviación Típica: Todos iguales (Cero)")
    void desviacionTipica_Cero() {
        List<Double> datos = Arrays.asList(7.0, 7.0, 7.0);
        assertEquals(0.0, Estadistica.desviacionTipica(datos), 0.0001);
    }

    @Test
    @DisplayName("Desviación Típica: Lista nula (Excepción)")
    void desviacionTipica_ListaNula() {
        assertThrows(NullPointerException.class, () -> Estadistica.desviacionTipica(null));
    }
}
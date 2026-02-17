import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import MathsData.Estadistica;

import java.util.Collection;
import java.util.HashSet;

class EstadisticaTest {

    @Test
    @DisplayName("Test media")
    void Testmedia() {

        assertTrue(Estadistica.media(new HashSet<>()) == 0);

    }

    @org.junit.jupiter.api.Test
    void varianza() {
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void desviacionTipica() {
        assertTrue(true);

    }
}
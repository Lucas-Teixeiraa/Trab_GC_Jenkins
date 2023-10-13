import static org.junit.Assert.assertEquals;

import gc.jenkins.Main;
import org.junit.Test;

public class ConversaoTemperaturaTest {

    @Test
    public void testFahrenheitParaCelsiusCaso1() {
        double temperaturaF = 32.0;
        double resultadoC = Main.fahrenheitParaCelsius(temperaturaF);
        assertEquals(0.0, resultadoC, 0.001); // Espera-se que seja aproximadamente igual a 0°C
    }

    @Test
    public void testFahrenheitParaCelsiusCaso2() {
        double temperaturaF = 100.0;
        double resultadoC = Main.fahrenheitParaCelsius(temperaturaF);
        assertEquals(37.778, resultadoC, 0.001); // Espera-se que seja aproximadamente igual a 37.778°C
    }

    @Test
    public void testFahrenheitParaCelsiusCaso3() {
        double temperaturaF = 212.0;
        double resultadoC = Main.fahrenheitParaCelsius(temperaturaF);
        assertEquals(100.0, resultadoC, 0.001); // Espera-se que seja aproximadamente igual a 100°C
    }
}

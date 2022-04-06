import org.junit.Test;

import static org.junit.Assert.*;

public class TimeBuilderTest {

    @Test
    public void deveRetornarExcecaoParaTimeSemNome() {
        try {
            TimeBuilder timeBuilder= new TimeBuilder();
            Time time = timeBuilder
                    .setJogador("Cr7")
                    .setTreinador("Guardiola")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarTimeValido() {
        TimeBuilder timeBuilder = new TimeBuilder();
        Time time = timeBuilder
                .setNome("Real Madrid")
                .setJogador("Cr7")
                .setTreinador("Anceloti")
                .setCor("Branco")
                .build();

        assertNotNull(time);
    }
}

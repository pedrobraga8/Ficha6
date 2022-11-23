import org.example.NumeroEx6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroEx6Test {
    NumeroEx6 numero;
    @BeforeEach
    public void setUp(){
        numero = new NumeroEx6();
    }

    @Test
    @DisplayName("Teste")
    public void media(){
        double avg = numero.media(123);
        assertEquals(2,avg,"Caso 1:Média errada");
    }
}

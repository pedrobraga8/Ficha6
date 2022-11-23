import org.example.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {

    Retangulo retangulo;
    @BeforeEach
    public void setUp(){retangulo=new Retangulo();
    }

    @Test
    public void area () {
        int result= retangulo.area(3, 5);
        assertEquals (15, result, "3x5=15");
        result= retangulo.area(5,8);
        assertEquals(40, result, "5x8=40");
        result=retangulo.area(2,4);
        assertEquals (8, result, "2x4=8");
    }

    @Test
    public void perimetro(){
        int resultado= retangulo.perimetro(3,5);
        assertEquals(16, resultado, "3*2+5*2=16");
        resultado= retangulo.perimetro(5,8);
        assertEquals(26, resultado, "5*2+8*2=26");
        resultado= retangulo.perimetro(2,4);
        assertEquals(12, resultado, "2*2+4*2=12");
    }


}

package calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;
import java.util.logging.Level;


public class SumaTest {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Test
    public void operar() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(2), new Float(2));
        if (result > 4 || result < 4) {
            Assert.fail();
        }
    }
    @Test
    public void operarNegativos() throws Exception {
        Suma suma = new Suma();
        float result = suma.operar(new Float(-6), new Float(-3));
        if (result > (-9) || result < (-9)) {
            Assert.fail();
        }
    }
    @Test
    public void operarRacionales() throws Exception {
        Suma suma = new Suma();
        float result = suma.operar(new Float(0.666), new Float(-0.333));
        if (result > (0.333f) || result < (0.333f)) {
            logger.log(Level.INFO, Float.toString(result));
            Assert.fail();
        }
    }
    @Test
    public void operarBinFloat() throws Exception {
        Suma suma = new Suma();
        float result = suma.operar(new Float(0.1), new Float(0.2));
        if (result > (0.3f) || result < (0.3f)) {
            logger.log(Level.INFO, Float.toString(result));
            Assert.fail();
        }
    }


}

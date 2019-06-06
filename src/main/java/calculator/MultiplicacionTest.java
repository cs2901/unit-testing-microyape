package calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;
import java.util.logging.Level;

public class MultiplicacionTest {
    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Test
    public void operar() throws Exception{
        Multiplicacion mult = new Multiplicacion();
        float result = mult.operar(new Float(0.1), new Float(0.2));
        if (result > 0.02f || result < 0.02f) {
            logger.log(Level.INFO, Float.toString(result));
            Assert.fail();
        }
    }
}
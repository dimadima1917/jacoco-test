import jacoco.JacocoClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JacocoClassTest {
    @Test
    public void testGetIntShouldReturnOne(){
        assertEquals(JacocoClass.getInt(), 1);
    }
}

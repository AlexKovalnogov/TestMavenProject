import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTypeOfTriangleTestSuite {
    CheckTypeOfTriangle checkTypeOfTriangle;

    @Before
    public void setUp()  {
        checkTypeOfTriangle = new CheckTypeOfTriangle();
    }

    @Test
    public void case1() {
        assertEquals("Length of Side can't be with minus", checkTypeOfTriangle.checkTriangle(3, 5, -1));

    }
}

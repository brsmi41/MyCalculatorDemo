package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class ScientificFeaturesTest {
    @Test
    public void sinFeatureTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(90);
        double actual = scientificFeatures.sinFeature();
        double expected = 0.8939966636005579;

        Assert.assertEquals(expected,actual,0);

    }

    @Test
    public void cosFeatureTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(10);
        double actual = scientificFeatures.cosFeature();
        double expected = -0.8390715290764524;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void tanFeatureTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(90);
        double actual = scientificFeatures.tanFeature();
        double expected = -1.995200412208242;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void inverseSinTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(1.0);
        double actual = scientificFeatures.inverseSin();
        double expected = 1.5707963267948966;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void inverseCosTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures();
        double actual = scientificFeatures.inverseCos();
        double expected = 1.5707963267948966;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void inverseTanTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(90);
        double actual = scientificFeatures.inverseTan();
        double expected = 1.5596856728972892;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void logFunctionTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(20);
        double actual = scientificFeatures.logFunction();
        double expected = 2.995732273553991;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void inverseLogTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(20);
        double actual = scientificFeatures.inverseLog();
        double expected = 1.3010299956639813;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void naturalLogTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(10);
        double actual = scientificFeatures.naturalLog();
        double expected = 2.3978952727983707;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void factorialTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(5);
        double actual = scientificFeatures.factorial();
        double expected = 120;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void switchUnitsModeTest(){
        ScientificFeatures scientificFeatures = new ScientificFeatures(90);
        double actual = scientificFeatures.switchUnitsMode();
        double expected = 0;

        Assert.assertEquals(expected,actual,0);
    }
}

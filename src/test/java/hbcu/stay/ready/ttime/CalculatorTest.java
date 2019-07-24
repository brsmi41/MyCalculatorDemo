package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void addTwoTest() {
        Calculator calculator = new Calculator();
        double actual = calculator.addTwo(2,2);
        double expected = 4;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void subtractTwoTest() {
        Calculator calculator = new Calculator();
        double actual = calculator.subtractTwo(10, 2);
        double expected = 8;

        Assert.assertEquals(expected, actual, 0);

    }
    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator(15);
        double actual = calculator.multiply(2);
        double expected = 30;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void multiplyTwoTest() {
        Calculator calculator = new Calculator();
        double actual = calculator.multiplyTwo(10, 2);
        double expected = 20;

            Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void divideTest() {
        Calculator calculator = new Calculator(15);
        double actual = calculator.divide(3);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void divideTwoTest() {
        Calculator calculator = new Calculator();
        double actual = calculator.divideTwo(10, 2);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test (expected = ArithmeticException.class)
    public void divideByZeroTest(){
        Calculator calculator = new Calculator(15);
        calculator.divide(0);

    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator(7);
        double actual = calculator.square();
        double expected = 49;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator(49);
        double actual = calculator.squareRoot();
        double expected = 7;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void exponentiationTest(){
        Calculator calculator = new Calculator(3);
        double actual = calculator.exponentiation(3);
        double expected = 27;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void inverseTest(){
        Calculator calculator = new Calculator(5);
        double actual = calculator.inverse();
        double expected = 0.2;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void invertSignTest(){
        Calculator calculator = new Calculator(-15);
        double actual = calculator.invertSign();
        double expected = 15;

        Assert.assertEquals(expected,actual,0);

    }

}

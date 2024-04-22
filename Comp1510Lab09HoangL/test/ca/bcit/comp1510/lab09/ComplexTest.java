package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {
    
    /** The two Complex objects to test. */
    Complex complex1;
    Complex complex2;
    final Complex I = new Complex(0, 1);
    final Complex ZERO = new Complex(0, 0);
    final Complex ONE = new Complex(1, 0);

    /** Create two Complex objects before each test is executed.
     * 
     * @throws Exception if the objects cannot be created
     */
    @BeforeEach
    public void setUp() throws Exception {
        complex1 = new Complex(3.0, 4.0);
        complex2 = new Complex(1.0, 1.0);
    }
    
    @Test
    void testHashCode() {
        int hash_code = complex1.hashCode();
        assertEquals(1572864, hash_code);
    }

    /** Test the Complex object. */
    @Test
    void testComplex() {
        assertEquals(3.0, complex1.re);
        assertEquals(4.0, complex1.im);
    }

    /** Test the polarComplex method. */
    @Test
    void testPolarComplex() {
        Complex complex = Complex.polarComplex(2.0, 100.0);
        assertEquals(1.7246377445753678, complex.re, 0.0000000001);
        assertEquals(-1.0127312822195176, complex.im, 0.0000000001);
    }

    /** Test the add objects method. */
    @Test
    void testAddComplex() {
        Complex addResult = complex1.add(complex2);
        assertEquals(4.0, addResult.re);
        assertEquals(5.0, addResult.im);
    }

    /** Test the add double method. */
    @Test
    void testAddDouble() {
        Complex result = complex1.add(2.0);
        assertEquals(5.0, result.re);
        assertEquals(4.0, result.im);
    }

    /** Test the subtract object method. */
    @Test
    void testSubtractComplex() {
        Complex subResult = complex1.subtract(complex2);
        assertEquals(2.0, subResult.re);
        assertEquals(3.0, subResult.im);
    }

    /** Test the subtract double method. */
    @Test
    void testSubtractDouble() {
        Complex result = complex1.subtract(1.0);
        assertEquals(2.0, result.re);
        assertEquals(4.0, result.im);
    }

    /** Test the multiply object method. */
    @Test
    void testMultiplyComplex() {
        Complex result = complex1.multiply(complex2);
        assertEquals(-1.0, result.re);
        assertEquals(7.0, result.im);
    }

    /** Test the multiply double method. */
    @Test
    void testMultiplyDouble() {
        Complex result = complex1.multiply(2.0); 
        assertEquals(6.0, result.re);
        assertEquals(8.0, result.im);
    }

    /** Test the reciprocal method. */
    @Test
    void testReciprocal() {
        Complex result = complex1.reciprocal();
        assertEquals(0.12, result.re);
        assertEquals(-0.16, result.im);
        
        Complex complex = new Complex(0, 0.0);
        assertThrows(IllegalArgumentException.class, 
                () -> {complex.reciprocal();});
    }

    /** Test the divide object method. */
    @Test
    void testDivideComplex() {
        Complex result = complex1.divide(complex2);
        assertEquals(3.5, result.re);
        assertEquals(0.5, result.im);
    }
    
    /** Test the divide object method. */
    @Test
    void testDivideComplex1() {
        Complex complex = new Complex(0.0, 0.0);
        assertThrows(IllegalArgumentException.class, 
                () -> { complex1.divide(complex);});
    }

    /** Test the divide double method. */
    @Test
    void testDivideDouble() {
        Complex result = complex1.divide(2.0);
        assertEquals(1.5, result.re);
        assertEquals(4.0, result.im);
        
        assertThrows(IllegalArgumentException.class, 
                () -> {complex1.divide(0);});
    }

    /** Test the sqrt method. */
    @Test
    void testSqrt() {
        Complex result = complex1.sqrt();
        assertEquals(2.0, result.re);
        assertEquals(1.0, result.im);
    }

    /** Test the equals object method. */
    @Test
    void testEqualsObject1() {
        boolean isEqual = complex1.equals(complex2);
        assertFalse(isEqual);
    }
    
    /** Test the equals object method. */
    @Test
    void testEqualsObject2() {
        boolean isEqual = complex1.equals(2.0);
        assertFalse(isEqual);
    }
    
    /** Test the equals object method. */
    @Test
    void testEqualsObject3() {
        Complex complex = new Complex(3.0, 1.0);
        boolean isEqual = complex1.equals(complex);
        assertFalse(isEqual);
    }
    
    /** Test the equals object method. */
    @Test
    void testEqualsObject4() {
        Complex complex = new Complex(2.0, 4.0);
        boolean isEqual = complex1.equals(complex);
        assertFalse(isEqual);
    }

    /** Test the equals object method. */
    @Test
    void testEqualsObject5() {
        Complex complex = new Complex(3.0, 4.0);
        boolean isEqual = complex1.equals(complex);
        assertTrue(isEqual);
    }
    
    /** Test toString method. */
    @Test
    void testToString() {
        assertEquals("3.0 + 4.0i", complex1.toString());
    }
    
    /** Test the toString method.*/
    @Test
    void testToString2() {
        Complex complex = new Complex(3.0, 0.0);
        assertEquals("3.0", complex.toString());
    }
    
    /** Test the toString method.*/
    @Test
    void testToString3() {
        Complex complex = new Complex(0.0, 4.0);
        assertEquals("4.0i", complex.toString());
    }
    
    /** Test the toString method.*/
    @Test
    void testToString4() {
        Complex complex = new Complex(3.0, -4.0);
        assertEquals("3.0 - 4.0i", complex.toString());
    }
    
    /** Test complex number 1. */
    @Test
    void TestConstant() {
        assertEquals(I, Complex.I);
        assertEquals(ZERO, Complex.ZERO);
        assertEquals(ONE, Complex.ONE);
    }
    
    /** Test I * I. */
    @Test
    void TestMultiplyI() {
        Complex result = Complex.I.multiply(Complex.I);
        assertEquals(-1.0, result.re);
    }
    
    /** Test the abs method. */
    @Test
    void testAbs() {
        double absValue = complex1.abs();
        assertEquals(5.0, absValue);
    }
    
    /** Test absolute value of I. */
    @Test
    void testAbsI() {
        double result = I.abs();
        assertEquals(1.0, result);
    }

    /** Test the arg method.*/
    @Test
    void testArg() {
        double arg = complex2.arg();
        assertEquals(0.7853981633974483, arg);
    }

//    /** Test pi / 4. */
//    void testPiDiv4() {
//        double piDiv4 = 3.141592653589793 / 4;
//        assertEquals(0.7853981633974483, piDiv4, 0.000000000000001);
//    }
    

    /** Test arg of I. */
    @Test
    void testArgI() {
        double result = Complex.I.arg();
        assertEquals(1.5707963267948966, result, 0.000000000000001);
    }
    
    /** Test pi / 2. */
    @Test 
    void testPiDiv2() {
        double piDiv2 = 3.141592653589793 / 2;
        assertEquals(1.5707963267948966, piDiv2, 0.000000000000001);
    }
    
//    /** Test negative one. */
//    void testMinusOne() {
//        Complex minusOne = Complex.ZERO.subtract(Complex.ONE);
//        assertEquals(-1, minusOne.re);
//    }
    
//    /** Test arg of negative one. */
//    void TestArgNegative1() {
//        Complex minusOne = Complex.ZERO.subtract(Complex.ONE);
//        double result = minusOne.arg();
//        assertEquals(3.141592653589793, result, 0.000000000000001);
//        assertEquals(Math.PI, result, 0.000000000000001);
//    }
    
    /** Test the conjugate method. */
    @Test
    void testConjugate() {
        Complex conjugate = complex1.conjugate();
        assertEquals(3.0, conjugate.re);
        assertEquals(-4.0, conjugate.im);
    }
    
    /** Test the exp method. */
    @Test
    void testExp() {
        Complex result = complex1.exp();
        assertEquals(-13.128783081462158, result.re);
        assertEquals(-15.200784463067954, result.im);
    }
    
    /** Test the log method. */
    @Test
    void testLog() {
        Complex result = complex1.log();
        assertEquals(1.6094379124341003, result.re);
        assertEquals(0.9272952180016122, result.im);
    }
    
    /** Test exp(log()) method. */
    @Test
    void testExpLog() {
        Complex result = complex1.log().exp();
        assertEquals(3.0, result.re);
        assertEquals(3.999999999999999, result.im);
    }
    
    /** Test log(exp()) method. */
    @Test
    void testLogExp() {
        Complex result = complex1.exp().log();
        assertEquals(3.0, result.re);
        assertEquals(- 2.2831853071795867, result.im);
    }
    
    /** Test exp method. */
    @Test
    void testExp1() {
        Complex result = complex2.exp();
        assertEquals(1.4686939399158851, result.re);
        assertEquals(2.2873552871788423, result.im);
    }
    
    /** Test log method. */
    @Test
    void testLog1() {
        Complex result = complex2.log();
        assertEquals(0.3465735902799727, result.re);
        assertEquals(0.7853981633974483, result.im);
    }
    
    /** Test exp(log()). */
    @Test 
    void testExpLog1() {
        Complex result = complex2.log().exp();
        assertEquals(1.0000000000000002, result.re);
        assertEquals(1.0, result.im);
    }
    
    /** Test log(exp()). */
    @Test
    void testLogExp1() {
        Complex result = complex2.exp().log();
        assertEquals(1.0, result.re);
        assertEquals(1.0, result.im);
    }
    
    /** Test exp(pi) + 1. */
    @Test
    void testExpPI() {
        Complex πi = new Complex(0.0, Math.PI);
        Complex result = πi.exp().add(Complex.ONE);
        assertEquals(1.2246467991473532E-16, result.im);
    }
   
}

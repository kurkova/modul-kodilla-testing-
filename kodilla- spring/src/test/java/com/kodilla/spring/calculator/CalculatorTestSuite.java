package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context;
    Calculator calculator;

    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        calculator = context.getBean(Calculator.class);
    }

    @Test
    public void testAdd() {
        //Given
        before();
        //When
        Double resultAdd = calculator.add(3.5, 4.5);
        //Then
        Assert.assertEquals(8.0, resultAdd, 0.001);
    }

    @Test
    public void testSub() {
        //Given
        before();
        //When
        Double resultSub = calculator.sub(8.5, 4.5);
        //Then
        Assert.assertEquals(4.0, resultSub, 0.001);
    }

    @Test
    public void testMul() {
        //Given
        before();
        //When
        Double resultSub = calculator.mul(8.26, 4.52);
        //Then
        Assert.assertEquals(37.335, resultSub, 0.001);
    }

    @Test
    public void testDiv() {
        //Given
        before();
        //When
        Double resultDiv = calculator.div(8.26, 4.52);
        //Then
        Assert.assertEquals(1.827, resultDiv, 0.001);
    }
}
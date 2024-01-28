package com.prac.testng;

import org.testng.annotations.Test;

import com.dev.calc.LibCalc;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class TestCalc {
  @Test
  public void testAdd() {
	  LibCalc calc  = new LibCalc();
	  int actSum = calc.Sum(10, 20);
	  int expSum = 30;
	  System.out.println("Sum is "+actSum);
	  assertEquals(actSum, expSum);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");
  }

}

package com.calc.app.service;

import static org.junit.jupiter.api.Assertions.*;

import com.calc.app.model.exception.NegativeNumberException;
import com.calc.app.model.exception.ZeroDivisionError;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

  @InjectMocks private CalculatorService calculatorService;

  @Test
  void should_add_two_positive_numbers() {
    assertEquals(15L, calculatorService.add(10L, 5L));
  }

  @Test
  void add_should_throw_when_negative() {
    assertThrows(NegativeNumberException.class, () -> calculatorService.add(-1L, 5L));
  }

  @Test
  void should_subtract_two_positive_numbers() {
    assertEquals(5L, calculatorService.subtract(10L, 5L));
  }

  @Test
  void subtract_should_throw_when_negative() {
    assertThrows(NegativeNumberException.class, () -> calculatorService.subtract(10L, -5L));
  }

  @Test
  void should_multiply_two_positive_numbers() {
    assertEquals(50L, calculatorService.multiply(10L, 5L));
  }

  @Test
  void multiply_should_throw_when_negative() {
    assertThrows(NegativeNumberException.class, () -> calculatorService.multiply(-1L, 5L));
  }

  @Test
  void should_divide_two_positive_numbers() {
    assertEquals(2L, calculatorService.divide(10L, 5L));
  }

  @Test
  void divide_should_throw_when_negative() {
    assertThrows(NegativeNumberException.class, () -> calculatorService.divide(-1L, 5L));
  }

  @Test
  void divide_should_throw_when_b_is_zero() {
    assertThrows(ZeroDivisionError.class, () -> calculatorService.divide(10L, 0L));
  }
}

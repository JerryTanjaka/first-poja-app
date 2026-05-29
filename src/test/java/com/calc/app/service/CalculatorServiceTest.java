package com.calc.app.service;
import com.calc.app.model.exception.NegativeNumberException;
import com.calc.app.model.exception.ZeroDivisionError;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    void should_add_two_positive_numbers() {
        assertEquals(15, calculatorService.add(10, 5));
    }

    @Test
    void add_should_throw_when_negative() {
        assertThrows(NegativeNumberException.class,
                () -> calculatorService.add(-1, 5));
    }
    @Test
    void should_subtract_two_positive_numbers() {
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    void subtract_should_throw_when_negative() {
        assertThrows(NegativeNumberException.class,
                () -> calculatorService.subtract(10, -5));
    }

    @Test
    void should_multiply_two_positive_numbers() {
        assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Test
    void multiply_should_throw_when_negative() {
        assertThrows(NegativeNumberException.class,
                () -> calculatorService.multiply(-1, 5));
    }

    @Test
    void should_divide_two_positive_numbers() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    void divide_should_throw_when_negative() {
        assertThrows(NegativeNumberException.class,
                () -> calculatorService.divide(-1, 5));
    }

    @Test
    void divide_should_throw_when_b_is_zero() {
        assertThrows(ZeroDivisionError.class,
                () -> calculatorService.divide(10, 0));
    }
}
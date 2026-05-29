package com.calc.app.service;

import com.calc.app.model.exception.NegativeNumberException;
import com.calc.app.model.exception.ZeroDivisionError;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public double add(double a, double b) {
    validate(a, b);
    return a + b;
  }

  public double subtract(double a, double b) {
    validate(a, b);
    return a - b;
  }

  public double multiply(double a, double b) {
    validate(a, b);
    return a * b;
  }

  public double divide(double a, double b) {
    validate(a, b);
    if (b == 0) throw new ZeroDivisionError();
    return a / b;
  }

  private void validate(double a, double b) {
    if (a < 0 || b < 0) {
      throw new NegativeNumberException("A or B cannot be negative");
    }
  }
}

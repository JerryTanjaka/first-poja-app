package com.calc.app.service;

import com.calc.app.model.exception.NegativeNumberException;
import com.calc.app.model.exception.ZeroDivisionError;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  public Long add(Long a, Long b) {
    validate(a, b);
    return a + b;
  }

  public Long subtract(Long a, Long b) {
    validate(a, b);
    return a - b;
  }

  public Long multiply(Long a, Long b) {
    validate(a, b);
    return a * b;
  }

  public Long divide(Long a, Long b) {
    validate(a, b);
    if (b == 0) throw new ZeroDivisionError();
    return a / b;
  }

  private void validate(Long a, Long b) {
    if (a < 0 || b < 0) {
      throw new NegativeNumberException("A or B cannot be negative");
    }
  }
}

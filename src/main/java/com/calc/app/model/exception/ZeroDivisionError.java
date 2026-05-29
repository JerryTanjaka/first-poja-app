package com.calc.app.model.exception;

public class ZeroDivisionError extends RuntimeException {
  public ZeroDivisionError() {
    super("Cannot divide by zero");
  }
}

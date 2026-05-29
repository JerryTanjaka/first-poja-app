package com.calc.app.endpoint.rest.arith;

import com.calc.app.service.CalculatorService;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
@AllArgsConstructor
public class CalcController {

  private final CalculatorService calculatorService;

  @GetMapping("/add")
  public ResponseEntity<?> add(@RequestParam double a, @RequestParam double b) {
    return ResponseEntity.ok(Map.of("result", calculatorService.add(a, b)));
  }

  @GetMapping("/subtract")
  public ResponseEntity<?> subtract(@RequestParam double a, @RequestParam double b) {
    return ResponseEntity.ok(Map.of("result", calculatorService.subtract(a, b)));
  }

  @GetMapping("/multiply")
  public ResponseEntity<?> multiply(@RequestParam double a, @RequestParam double b) {
    return ResponseEntity.ok(Map.of("result", calculatorService.multiply(a, b)));
  }

  @GetMapping("/divide")
  public ResponseEntity<?> divide(@RequestParam double a, @RequestParam double b) {
    return ResponseEntity.ok(Map.of("result", calculatorService.divide(a, b)));
  }
}

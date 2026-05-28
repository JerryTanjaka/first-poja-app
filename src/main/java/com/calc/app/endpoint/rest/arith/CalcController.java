package com.calc.app.endpoint.rest.arith;
import com.poja.first.service.AddService;
import com.poja.first.service.SubtractService;
import com.poja.first.service.MultiplyService;
import com.poja.first.service.DivideService;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/calc")
public class CalculatorController {

    private final AddService addService;
    private final SubtractService subtractService;
    private final MultiplyService multiplyService;
    private final DivideService divideService;

    @GetMapping("/add")
    public ResponseEntity<?> add(@RequestParam double a, @RequestParam double b) {
        double result = addService.add(a, b);
        return ResponseEntity.ok(Map.of("result", result));
    }


    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam double a, @RequestParam double b) {
        double result = subtractService.subtract(a, b);
        return ResponseEntity.ok(Map.of("result", result));
    }

    @GetMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam double a, @RequestParam double b) {
        double result = multiplyService.multiply(a, b);
        return ResponseEntity.ok(Map.of("result", result));
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam double a, @RequestParam double b) {
        double result = divideService.divide(a, b);
        return ResponseEntity.ok(Map.of("result", result));
    }
}
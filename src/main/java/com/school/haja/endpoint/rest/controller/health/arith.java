package com.school.haja.endpoint.rest.controller.health;

import com.school.haja.service.ArithService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class arith {

    private final ArithService arithService;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return arithService.add(a, b);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam int a, @RequestParam int b) {
        return arithService.minus(a, b);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return arithService.divide(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return arithService.multiply(a, b);
    }
}

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
    public Double add(@RequestParam Double a, @RequestParam Double b) {
        return arithService.add(a, b);
    }

    @GetMapping("/minus")
    public Double minus(@RequestParam Double a, @RequestParam Double b) {
        return arithService.minus(a, b);
    }

    @GetMapping("/devide")
    public Double divide(@RequestParam Double a, @RequestParam Double b) {
        return arithService.divide(a, b);
    }

    @GetMapping("/multiply")
    public Double multiply(@RequestParam Double a, @RequestParam Double b) {
        return arithService.multiply(a, b);
    }
}

package dockerstudy.controllers;

import dockerstudy.services.MathService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/dockerstudy")
public class Controller {

    @Resource
    private MathService mathService;

    @GetMapping("/sum")
    public ResponseEntity<Double> sum(@RequestParam List<Double> numbers) {
        return ResponseEntity.ok(mathService.sum(numbers));
    }
}

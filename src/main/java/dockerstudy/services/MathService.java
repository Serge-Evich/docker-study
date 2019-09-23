package dockerstudy.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathService {
    public double sum(List<Double> numbers) {
        return numbers.stream().mapToDouble(x -> x).sum();
    }

    public double multiply(List<Double> numbers) {
        return numbers.stream().reduce((x, y) -> x * y).orElse(0d);
    }
}

import dockerstudy.services.MathService;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MathServiceTest {
    @InjectMocks
    private MathService mathService = new MathService();

    @Test
    public void shouldReturnFour() {
        assertThat(mathService.sum(Arrays.asList(2d, 2d))).isEqualTo(4);
    }

    @Test
    public void shouldReturnTen() {
        assertThat(mathService.multiply(Arrays.asList(2d, 5d))).isEqualTo(10);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void testDivideByZeroShouldThrowArithmeticException() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            try {
                calculator.divide(10, 0);
            } catch (ArithmeticException e) {
                // Log de erro em caso de exceção
                logger.error("Erro durante a divisão", e);
                throw e;
            }
        });

        // Log de info após a tentativa de divisão
        logger.info("Teste concluído com tentativa de divisão por zero.");
    }
}

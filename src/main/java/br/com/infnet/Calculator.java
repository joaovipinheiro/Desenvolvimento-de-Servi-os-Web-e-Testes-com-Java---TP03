public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int divide(int numerator, int denominator) {
        logger.debug("Iniciando operação de divisão");

        if (denominator == 0) {
            logger.error("Tentativa de divisão por zero. Numerador: {}, Denominador: {}", numerator, denominator);
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        logger.info("Operação de divisão em andamento. Numerador: {}, Denominador: {}", numerator, denominator);

        int result = numerator / denominator;

        logger.debug("Operação de divisão concluída. Resultado: {}", result);

        return result;
    }
}

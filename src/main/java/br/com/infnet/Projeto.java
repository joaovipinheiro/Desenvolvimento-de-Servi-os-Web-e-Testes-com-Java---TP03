package br.com.infnet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Projeto {
    private static final Logger logger = LoggerFactory.getLogger(Projeto.class);

    public void MetodoTeste() {
        logger.info("Isso é uma mensagem de info.");
        logger.debug("Isso é uma mensagem de debug.");

        try {
        } catch (Exception e) {
            logger.error("Isso é uma mensagem de erro.", e);
        }
    }
}
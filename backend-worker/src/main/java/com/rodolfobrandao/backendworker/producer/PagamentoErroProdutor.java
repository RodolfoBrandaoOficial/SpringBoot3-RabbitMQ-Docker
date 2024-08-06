package com.rodolfobrandao.backendworker.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoErroProdutor {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void gerarResposta(String mensage) {
        amqpTemplate.convertAndSend(
                "pagamento-response-erro-queue",
                "pagamento-response-erro-rout-key",
                mensage);

    }

}

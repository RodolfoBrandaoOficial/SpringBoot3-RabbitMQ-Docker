package com.rodolfobrandao.backendworker.producer;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoSucessoProdutor {
    @Autowired private AmqpTemplate amqpTemplate;

    public void gerarResposta(String mensage) {
        amqpTemplate.convertAndSend(
                "pagamento-response-sucesso-queue",
                "pagamento-response-sucesso-rout-key",
                mensage);
    }
}

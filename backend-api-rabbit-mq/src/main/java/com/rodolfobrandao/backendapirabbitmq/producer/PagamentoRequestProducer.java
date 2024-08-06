package com.rodolfobrandao.backendapirabbitmq.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rodolfobrandao.backendapirabbitmq.dto.PagamentoDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRequestProducer {
    @Autowired private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();
    public void integrar (PagamentoDTO pagamento) throws JsonProcessingException {
        amqpTemplate.convertAndSend(
                "pagamento-request-queue",
                "pagamento-request-rout-key",
                objectMapper.writeValueAsString(pagamento)
        );
    }
}

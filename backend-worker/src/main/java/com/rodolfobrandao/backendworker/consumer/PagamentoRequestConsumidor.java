package com.rodolfobrandao.backendworker.consumer;

import com.rodolfobrandao.backendworker.producer.PagamentoErroProdutor;
import com.rodolfobrandao.backendworker.producer.PagamentoSucessoProdutor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PagamentoRequestConsumidor {

    @Autowired
    private PagamentoSucessoProdutor pagamentoSucessoProdutor;
    @Autowired
    private PagamentoErroProdutor pagamentoErroProdutor;

    @RabbitListener(queues = "pagamento-request-queue")
    public void receberMensagem(@Payload Message message) {
        System.out.println("Mensagem recebida: " + message.getPayload());
        if (new Random().nextBoolean()) {
            pagamentoSucessoProdutor.gerarResposta("Mensagem de Sucesso de pagamento " + message);
        } else {
            pagamentoErroProdutor.gerarResposta("Mensagem de Erro de pagamento " + message);
        }
    }
}

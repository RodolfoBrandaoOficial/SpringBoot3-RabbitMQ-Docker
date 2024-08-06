package com.rodolfobrandao.backendapirabbitmq.facade;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.rodolfobrandao.backendapirabbitmq.dto.PagamentoDTO;
import com.rodolfobrandao.backendapirabbitmq.producer.PagamentoRequestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PagamentoFacade {

    @Autowired
    private PagamentoRequestProducer producer;

    public String solicitarPagamento(PagamentoDTO request) throws JsonProcessingException {
        try {
            producer.integrar(request);
        } catch (JsonProcessingException e) {
           return "Ocorreu um erro ao solicitar pagamento..." + e.getMessage();
        }
        return "Pagamento aguardando confirmação...";
    }

    public void erroPagamento(String payload) {
        System.err.println("RESPOSTA: Erro no pagamento: " + payload);
    }

    public void sucessoPagamento(String payload) {
        System.out.println("RESPOSTA: Pagamento realizado com sucesso: " + payload);
    }
}

package com.rodolfobrandao.backendapirabbitmq.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rodolfobrandao.backendapirabbitmq.dto.PagamentoDTO;
import com.rodolfobrandao.backendapirabbitmq.facade.PagamentoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoApi {
    @Autowired private PagamentoFacade pagamentoFacade;

    @PostMapping("/")
    public String processar (@RequestBody PagamentoDTO request) throws JsonProcessingException {
        return pagamentoFacade.solicitarPagamento(request);
    }

}

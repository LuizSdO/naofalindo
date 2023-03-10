package br.com.fiap.naofalindo.Controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.naofalindo.models.Despesa;
@RestController
public class ControllerDespesa {

    @GetMapping("/api/despesa")
    
    public Despesa show(){
        return new Despesa(
            new BigDecimal(100),
            LocalDate.now(),
            "Cinema com os amigos"
        );
    }
}

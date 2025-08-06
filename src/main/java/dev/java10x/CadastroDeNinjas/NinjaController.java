package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Esse é a minha primeira rota em SpringBoot";
    }
}

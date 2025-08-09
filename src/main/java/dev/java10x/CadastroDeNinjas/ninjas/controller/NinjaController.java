package dev.java10x.CadastroDeNinjas.ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Esse é a minha primeira rota em SpringBoot";
    }

    // ADICIONAR NINJA (CREATE)
    @PostMapping("/create")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("/all")
    public String mostrarNinjas(){
        return "Mostrar ninja";
    }

    // MOSTRAR NINJA POR ID
    @GetMapping("/allById")
    public String mostrarNinjasPorId(){
        return "Mostrar Ninja por ID";
    }

    // EDITAR NINJA POR ID
    @PutMapping("/editById")
    public String editNinjaPorId(){
        return "Alterar Ninja por ID";
    }

    // DELETAR NINJA POR ID
    @DeleteMapping("/deleteById")
    public String deleteNinjaPorId(){
        return "Ninja deeletado por ID";
    }




}

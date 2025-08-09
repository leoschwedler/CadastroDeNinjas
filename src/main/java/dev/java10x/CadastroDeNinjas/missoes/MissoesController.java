package dev.java10x.CadastroDeNinjas.missoes.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "missoes/")
@RestController
public class MissoesController {


    @PostMapping("create")
    public String createMission() {
        return "Missao criada com sucesso";
    }

    @PutMapping("edit")
    public String editMission() {
        return "Missao editada com sucesso";
    }

    @GetMapping("show")
    public String showMission() {
        return "Missoes listadas com sucesso";
    }

    @GetMapping("showById")
    public String showMissionById() {
        return "Missoes listadas por id com sucesso";
    }

    @DeleteMapping("deleteById")
    public String deleteMissionById() {
        return "Missao deletada por id com sucesso";
    }
}

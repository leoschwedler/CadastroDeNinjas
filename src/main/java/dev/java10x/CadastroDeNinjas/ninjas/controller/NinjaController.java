package dev.java10x.CadastroDeNinjas.ninjas.controller;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("ninjas")
@RestController
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // ADICIONAR NINJA (CREATE)
    @PostMapping("insert")
    public NinjaModel insertNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.insertNinja(ninjaModel);
    }

    // MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("all")
    public List<NinjaModel> showAllNinjas(){
        return ninjaService.showAllNinjas();
    }

    // MOSTRAR NINJA POR ID
    @GetMapping("showById/{id}")
    public Optional<NinjaModel> showNinjaById(@PathVariable Long id){
        return ninjaService.showNinjaById(id);
    }

    // EDITAR NINJA POR ID
    @PutMapping("editById")
    public String editNinjaPorId(){
        return "Alterar Ninja por ID";
    }

    // DELETAR NINJA POR ID
    @DeleteMapping("deleteById/{id}")
    public void deleteNinja(@PathVariable Long id){
        ninjaService.deleteNinja(id);
    }






}

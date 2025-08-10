package dev.java10x.CadastroDeNinjas.ninjas.controller;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
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
    public NinjaDto insertNinja(@RequestBody NinjaDto ninjaDto) {
        return ninjaService.insertNinja(ninjaDto);
    }

    // MOSTRAR TODOS OS NINJAS (READ)
    @GetMapping("all")
    public List<NinjaModel> showAllNinjas() {
        return ninjaService.showAllNinjas();
    }

    // MOSTRAR NINJA POR ID
    @GetMapping("showById/{id}")
    public Optional<NinjaModel> showNinjaById(@PathVariable Long id) {
        return ninjaService.showNinjaById(id);
    }

    // EDITAR NINJA POR ID
    @PutMapping("editById/{id}")
    public NinjaModel editNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaModel) {
        return ninjaService.updateNinja(ninjaModel, id);
    }

    // DELETAR NINJA POR ID
    @DeleteMapping("deleteById/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaService.deleteNinja(id);
    }


}

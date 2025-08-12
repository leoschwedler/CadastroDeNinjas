package dev.java10x.CadastroDeNinjas.ninjas.controller;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.service.NinjaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("ninjas")
@RestController
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    @PostMapping("insert")
    public ResponseEntity<String> insertNinja(@RequestBody NinjaDto ninjaDto) {
        NinjaDto ninja = ninjaService.insertNinja(ninjaDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + ninja.getName() + " Com o id: " + ninja.getId());
    }


    @GetMapping("all")
    public ResponseEntity<List<NinjaDto>> showAllNinjas() {
        List<NinjaDto> ninjas = ninjaService.showAllNinjas();
        return ResponseEntity.ok(ninjas);
    }


    @GetMapping("showById/{id}")
    public ResponseEntity<?> showNinjaById(@PathVariable Long id) {
        NinjaDto ninja = ninjaService.showNinjaById(id);
        if (ninja != null){
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com o ID: " + id + " nao existe nos nossos registros");
        }
    }


    @PutMapping("editById/{id}")
    public ResponseEntity<?> editNinjaPorId(@PathVariable Long id, @RequestBody NinjaDto ninjaDto) {
        NinjaDto ninja = ninjaService.updateNinja(ninjaDto, id);
        if (ninja != null){
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o ID: " + id + " nao foi encontrado");
        }
    }


    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<String> deleteNinja(@PathVariable Long id) {
        if (ninjaService.showNinjaById(id) != null){
            ninjaService.deleteNinja(id);
            return ResponseEntity.ok("O ninja com o ID: " + id + " foi deletado");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o ID: " + id + " nao encontrando");
        }
    }


}

package dev.java10x.CadastroDeNinjas.ninjas.controllerUI;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.service.NinjaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("ninjas/ui")
@Controller
public class NinjaControllerUi {

    private final NinjaService ninjaService;

    public NinjaControllerUi(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    @GetMapping("all")
    public String showAllNinjas(Model model) {
        List<NinjaDto> ninjas = ninjaService.showAllNinjas();
        model.addAttribute("ninjas", ninjas);
        return "showAllNinjas";

    }

}

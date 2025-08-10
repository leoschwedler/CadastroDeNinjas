package dev.java10x.CadastroDeNinjas.ninjas.service;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    public List<NinjaModel> showAllNinjas() {
        return ninjaRepository.findAll();
    }

    public Optional<NinjaModel> showNinjaById(Long id) {
        return ninjaRepository.findById(id);
    }

    public NinjaModel insertNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaModel updateNinja(NinjaModel ninja, Long id) {
        if (ninjaRepository.existsById(id)) {
            return ninjaRepository.save(ninja);
        } else {
            return null;
        }
    }
}

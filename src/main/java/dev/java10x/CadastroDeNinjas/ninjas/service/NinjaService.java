package dev.java10x.CadastroDeNinjas.ninjas.service;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;


    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> showAllNinjas() {
        return ninjaRepository.findAll();
    }

    public Optional<NinjaModel> showNinjaById(Long id) {
        return ninjaRepository.findById(id);
    }

    public NinjaDto insertNinja(NinjaDto ninjaDto) {
        NinjaModel ninja = ninjaMapper.map(ninjaDto);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
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

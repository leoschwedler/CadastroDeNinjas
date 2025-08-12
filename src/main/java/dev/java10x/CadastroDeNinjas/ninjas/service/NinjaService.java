package dev.java10x.CadastroDeNinjas.ninjas.service;

import dev.java10x.CadastroDeNinjas.ninjas.dto.NinjaDto;
import dev.java10x.CadastroDeNinjas.ninjas.mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import dev.java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;


    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDto> showAllNinjas() {
        List<NinjaModel> ninja = ninjaRepository.findAll();
        return ninja.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDto showNinjaById(Long id) {
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        return ninja.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDto insertNinja(NinjaDto ninjaDto) {
        NinjaModel ninja = ninjaMapper.map(ninjaDto);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaDto updateNinja(NinjaDto ninjaDto, Long id) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaModel = ninjaMapper.map(ninjaDto);
            ninjaModel.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaModel);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }
}

package dev.java10x.CadastroDeNinjas.missoes.service;

import dev.java10x.CadastroDeNinjas.missoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }
}

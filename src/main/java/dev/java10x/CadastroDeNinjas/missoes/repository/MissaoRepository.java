package dev.java10x.CadastroDeNinjas.missoes.repository;

import dev.java10x.CadastroDeNinjas.missoes.model.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
}

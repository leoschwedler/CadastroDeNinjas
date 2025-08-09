package dev.java10x.CadastroDeNinjas.missoes.model;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificulty;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}

package dev.java10x.CadastroDeNinjas.ninjas.dto;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDto {

    private Long id;

    private String name;

    private String email;

    private int age;

    private String rank;

    private String imrUrl;

    private MissoesModel missoes;

}

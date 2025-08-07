package dev.java10x.CadastroDeNinjas.missoes.model;

import dev.java10x.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificulty;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissaoModel(String name, String dificulty, List<NinjaModel> ninjas) {
        this.name = name;
        this.dificulty = dificulty;
        this.ninjas = ninjas;
    }

    public MissaoModel() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        dificulty = dificulty;
    }
}

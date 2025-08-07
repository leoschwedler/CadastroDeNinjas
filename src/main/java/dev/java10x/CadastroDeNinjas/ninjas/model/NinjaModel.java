package dev.java10x.CadastroDeNinjas.ninjas.model;

import dev.java10x.CadastroDeNinjas.missoes.model.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissaoModel missoes;

    public NinjaModel(String name, String email, int age, MissaoModel missoes) {
        this(name,age,email);
        this.missoes = missoes;
    }



    public NinjaModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public NinjaModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

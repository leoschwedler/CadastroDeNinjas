package dev.java10x.CadastroDeNinjas.ninjas.dto;

import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class NinjaDto {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    private String email;

    private int age;

    private String rank;

    private String imgUrl;

    private MissoesModel missoes;

}

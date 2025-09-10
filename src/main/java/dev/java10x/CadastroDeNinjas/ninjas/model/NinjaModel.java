package dev.java10x.CadastroDeNinjas.ninjas.model;


import dev.java10x.CadastroDeNinjas.missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor

@AllArgsConstructor
@ToString
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(unique = true)
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "ranking") // por exemplo
    private String rank;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }
}

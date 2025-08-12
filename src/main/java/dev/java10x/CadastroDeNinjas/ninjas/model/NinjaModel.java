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
@Data
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
    @Column(name = "rank")
    private String rank;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}

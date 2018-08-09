package org.womakerscode.seriesdatabase.entity;


import javax.persistence.*;


@Entity
public class Serie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String descricao;

    private Serie(){}

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}

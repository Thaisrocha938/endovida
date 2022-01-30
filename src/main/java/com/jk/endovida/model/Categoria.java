package com.jk.endovida.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "TB_CATEGORIA",schema = "ENDOVIDA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CATEGORIA")
    private Long id;

    @ManyToOne
    private Doencas doencas;

    @Column(name = "NOME")
    private String nome;

}

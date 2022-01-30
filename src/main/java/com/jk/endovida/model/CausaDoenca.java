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
@Table(name = "TB_CAUSA_DOENCA",schema = "ENDOVIDA")
public class CausaDoenca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DOENCAS")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ID_DOENCAS")
    private Doencas doenca;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;
}

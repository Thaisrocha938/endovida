package com.jk.endovida.model;

import com.jk.endovida.Enuns.EnumAreaAfetada;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "TB_DOENCAS",schema = "ENDOVIDA")
public class Doencas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_DOENCAS")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @OneToMany(mappedBy = "DOENCA")
    private List<Sintomas> sintomas;

    @ManyToOne
    @JoinColumn(name="ID_CATEGORIA")
    private Categoria categoria;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "AREA_AFETADA_ENUM")
    private EnumAreaAfetada enumAreaAfetada;

    @Column(name = "DESCRICAO")
    private String descricao;

    @OneToMany(mappedBy = "DOENCA")
    @Column(name = "CAUSA_DOENCA")
    private List<CausaDoenca> causaDoenca;


}

package com.jk.endovida.model;

import com.jk.endovida.Enuns.TipoUsuarioEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "TB_USUARIOS",schema = "ENDOVIDA")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 394180779962716892L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "EMAIL")
    private String email;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "USUARIO_ENUM")
    private TipoUsuarioEnum tipoUsuarioEnum;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ENDERECO_ID", referencedColumnName = "ID_ENDERECO")
    public Endereco enderecoId;
}

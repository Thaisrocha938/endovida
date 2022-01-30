package com.jk.endovida.Enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUsuarioEnum {

    PACIENTE ("PACIENTE"),
    MEDICO ("MEDICO"),
    ADMINISTRADOR ("ADMINISTRADOR");

    private String descricao;
}

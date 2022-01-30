package com.jk.endovida.Enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumAreaAfetada {

    OVARIO("OVARIO"),
    UTERO("UTERO"),
    CANAL_VAGINAL("CANAL VAGINAL");

    private String descricao;
}

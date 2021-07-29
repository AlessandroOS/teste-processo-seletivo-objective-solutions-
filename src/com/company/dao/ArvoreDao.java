package com.company.dao;

import com.company.model.Elemento;

public class ArvoreDao {

    public Elemento<String> iniciarArvore() {
        Elemento<String> arvore = new Elemento<>(null, null, null);
        arvore.setSim(new Elemento<>("O prato que você pensou é lasanha?", null, null));
        arvore.setNao(new Elemento<>("O prato que você pensou é bolo de chocolate?", null, null));
        arvore.setValor("O prato que você pensou é massa?");

        return arvore;
    }
}

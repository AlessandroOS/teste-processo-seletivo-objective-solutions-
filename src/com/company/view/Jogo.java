package com.company.view;

import com.company.model.Elemento;

public class Jogo {

    private final Consulta consulta;
    private final NovoElementoUsuario novoElementoUsuario;

    public Jogo(Consulta consulta, NovoElementoUsuario novoElementoUsuario) {
        this.consulta = consulta;
        this.novoElementoUsuario = novoElementoUsuario;
    }

    public void iniciar(Elemento<String> elementoAtual) {

        System.out.println("\n*** Responda (S) para SIM e (N) para NÃO de acordo com o prato que voce esta pensando! ***");
        System.out.println("Pense em um prato que gosta.");

        do {
            System.out.println(elementoAtual.getValor());
            if (consulta.simOuNao())
                elementoAtual = elementoAtual.getSim();
            else
                elementoAtual = elementoAtual.getNao();
        } while (!elementoAtual.isNull());

        System.out.println(elementoAtual.getValor());
        if (!consulta.simOuNao())
            novoElementoUsuario.criarNovoElemento(elementoAtual);
        else
            System.out.println("Acertei de novo!");
    }
}

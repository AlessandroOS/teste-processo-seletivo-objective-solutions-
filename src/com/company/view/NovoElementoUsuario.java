package com.company.view;

import com.company.model.Elemento;
import com.company.view.Consulta;

import java.util.Scanner;

public class NovoElementoUsuario {

    Scanner sc = new Scanner(System.in);

    public void criarNovoElemento(Elemento<String> elemento) {

        Consulta consulta = new Consulta();

        String pratoSugerido = elemento.getValor();
        System.out.println("Qual prato você pensou? ");
        String pratoUsuarioPensou = sc.nextLine();
        System.out.println(pratoUsuarioPensou + " é ______ (digite uma caracteristica para descobrir o prato)");
        String novaPergunta = sc.nextLine();

        elemento.setValor(novaPergunta);
        System.out.println("Um(a) " + pratoUsuarioPensou + " é " + novaPergunta);

        if (consulta.simOuNao())
        {
            elemento.setNao(new Elemento<>(pratoSugerido, null, null));
            elemento.setSim(new Elemento<>(pratoUsuarioPensou, null, null));
        }
        else
        {
            elemento.setNao(new Elemento<>(pratoUsuarioPensou, null, null));
            elemento.setSim(new Elemento<>(pratoSugerido, null, null));
        }

    }
}

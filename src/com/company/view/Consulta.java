package com.company.view;

import java.util.Scanner;

public class Consulta {

    Scanner sc = new Scanner(System.in);

    public boolean simOuNao() {
        String resposta;
        do {
            System.out.println("S ou N: ");
            resposta = sc.nextLine().toUpperCase();
        } while (!resposta.equals("S") && !resposta.equals("N"));

        return resposta.equals("S");
    }
}

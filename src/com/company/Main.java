package com.company;

import com.company.dao.ArvoreDao;
import com.company.model.Elemento;
import com.company.view.NovoElementoUsuario;
import com.company.view.Consulta;
import com.company.view.Jogo;

public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo(new Consulta(), new NovoElementoUsuario());
        Consulta consulta = new Consulta();
        ArvoreDao arvoreDao = new ArvoreDao();
        Elemento<String> raiz = arvoreDao.iniciarArvore();

        do {
            jogo.iniciar(raiz);
            System.out.println("Jogar novamente?");
        } while (consulta.simOuNao());
    }
}

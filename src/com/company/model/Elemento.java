package com.company.model;

public class Elemento<E> {
    private E valor;
    private Elemento<E> nao;
    private Elemento<E> sim;

    public Elemento(E valor, Elemento<E> nao, Elemento<E> sim) {
        this.valor = valor;
        this.nao = nao;
        this.sim = sim;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Elemento<E> getNao() {
        return nao;
    }

    public void setNao(Elemento<E> nao) {
        this.nao = nao;
    }

    public Elemento<E> getSim() {
        return sim;
    }

    public void setSim(Elemento<E> sim) {
        this.sim = sim;
    }

    public boolean isNull() {
        return (nao == null) && (sim == null);
    }
}

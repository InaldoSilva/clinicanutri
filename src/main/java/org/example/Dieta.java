package org.example;

public class Dieta {
    private String descricao;
    private String alimentos; // poderia ser uma lista, simplificado aqui

    public Dieta(String descricao, String alimentos) {
        this.descricao = descricao;
        this.alimentos = alimentos;
    }

    public String getDescricao() { return descricao; }
    public String getAlimentos() { return alimentos; }
}

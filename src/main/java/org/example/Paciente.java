package org.example;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private Dieta dieta;

    public Paciente(String nome, int idade, double peso, Dieta dieta) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dieta = dieta;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }
    public Dieta getDieta() { return dieta; }
}

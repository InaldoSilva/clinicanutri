package org.example;

public class Paciente {
    private final String nome;
    private final int idade;
    private final double altura;
    private final double peso;
    private final Dieta dieta;

    public Paciente(String nome, int idade, double altura, double peso, Dieta dieta) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.dieta = dieta;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    public Dieta getDieta() { return dieta; }
}

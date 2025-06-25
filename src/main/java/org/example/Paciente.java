package org.example;

public class Paciente {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private Dieta dieta;

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

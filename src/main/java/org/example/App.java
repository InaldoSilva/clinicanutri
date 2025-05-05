package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dieta dieta1 = new Dieta("Dieta Hipocalórica", "Frutas, legumes, carne magra");
        Dieta dieta2 = new Dieta("Dieta Rica em Proteínas", "Ovos, peito de frango, feijão");

        Paciente p1 = new Paciente("Ana Silva", 28, 65.5, dieta1);
        Paciente p2 = new Paciente("João Souza", 35, 82.0, dieta2);

        List<Paciente> pacientes = Arrays.asList(p1, p2);

        RelatorioService relatorioService = new RelatorioService();
        relatorioService.gerarRelatorio(pacientes, "Abril", 2025);
    }
}


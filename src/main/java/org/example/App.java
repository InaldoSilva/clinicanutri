package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dieta dieta1 = new Dieta("Dieta Hipocalórica", "Frutas, legumes, carne magra");
        Dieta dieta2 = new Dieta("Dieta Rica em Proteínas", "Ovos, peito de frango, feijão");
        Dieta dieta3 = new Dieta("Dieta low carb com 75% de proteínas", "Batata doce, peito de frango, Peixe, Ovos");

        Paciente p1 = new Paciente("Ana Silva", 28, 1.60, 65.5, dieta1);
        Paciente p2 = new Paciente("João Souza", 35, 1.81, 82.0, dieta2);
        Paciente p3 = new Paciente("Gustavo Marques", 39, 1.77, 90, dieta1);
        Paciente p4 = new Paciente("Josué Castro Neves", 48, 1.72, 102, dieta3);

        List<Paciente> pacientes = Arrays.asList(p1, p2, p3, p4);
        RelatorioService relatorioService = new RelatorioService();
        relatorioService.gerarRelatorio(pacientes, "Abril", 2025);
    }
}


package org.example;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RelatorioService {

    public void gerarRelatorio(List<Paciente> pacientes, String mes, int ano) {
        gerarPDF(pacientes, mes, ano);
        gerarCSV(pacientes, mes, ano);
    }

    private void gerarPDF(List<Paciente> pacientes, String mes, int ano) {
        String fileName = "relatorio_" + mes + "_" + ano + ".pdf";
        try {
            PdfWriter writer = new PdfWriter(fileName);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Relatório Gerencial - " + mes + "/" + ano));
            document.add(new Paragraph("===================================================================="));
            document.add(new Paragraph("NutriClin"));
            document.add(new Paragraph("Clínica de Nutrição"));
            document.add(new Paragraph("===================================================================="));

            for (Paciente p : pacientes) {
                document.add(new Paragraph("Nome: " + p.getNome()));
                document.add(new Paragraph("Idade: " + p.getIdade() + " anos"));
                document.add(new Paragraph("Altura: " + p.getAltura() + " metro"));
                document.add(new Paragraph("Peso: " + p.getPeso() + " kg"));
                document.add(new Paragraph("Dieta: " + p.getDieta().getDescricao()));
                document.add(new Paragraph("Alimentos: " + p.getDieta().getAlimentos()));
                document.add(new Paragraph("----------------------------------------------------------------"));
            }

            document.close();
            System.out.println("PDF gerado: " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao gerar PDF: " + e.getMessage());
        }
    }

    private void gerarCSV(List<Paciente> pacientes, String mes, int ano) {
        String fileName = "relatorio_" + mes + "_" + ano + ".csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            // Cabeçalho
            writer.writeNext(new String[]{"Nome", "Idade", "Altura", "Peso", "Dieta", "Alimentos"});

            // Dados
            for (Paciente p : pacientes) {
                String[] dados = {
                        p.getNome(),
                        String.valueOf(p.getIdade()),
                        String.valueOf(p.getPeso()),
                        p.getDieta().getDescricao(),
                        p.getDieta().getAlimentos()
                };
                writer.writeNext(dados);
            }

            System.out.println("CSV gerado: " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao gerar CSV: " + e.getMessage());
        }
    }
}



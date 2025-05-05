package Cofrinho;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia a coleção de moedas
public class Cofrinho {
    private List<Moeda> listaMoedas = new ArrayList<>();

    // Adiciona uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // Remove moedas do tipo especificado (por valor)
    public void remover(Moeda tipoMoeda, double valor) {
        for (Moeda moeda : listaMoedas) {
            if (moeda.getClass().equals(tipoMoeda.getClass()) && moeda.valor == valor) {
                listaMoedas.remove(moeda);
                System.out.println("Moeda removida com sucesso!");
                return;
            }
        }
        System.out.println("Moeda não encontrada.");
    }

    // Lista todas as moedas no cofrinho
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }
        System.out.println("----- Moedas no Cofrinho -----");
        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
    }

    // Calcula o total convertido para Real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}

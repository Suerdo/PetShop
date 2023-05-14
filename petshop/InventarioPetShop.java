package petshop;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetShop {

    private List<Servico> servicosPet = new ArrayList<>();

    public void addServico(Servico s) {
        s.setCodigo(servicosPet.size());
        servicosPet.add(s);
    }

    public double calculaServico(int posicao) {
        return servicosPet.get(posicao).calculaPreco();
    }

    public double calculaTodosServicos() {
        double totalServicos = 0;
        for (Servico s : servicosPet) {
            totalServicos += s.calculaPreco();
        }
        return totalServicos;
    }

    public String emitirRelatorio() {
        System.out.println("Relatório de serviços:");
        System.out.println("Nome\tData\t\tNome do Animal\tCódigo\tPreço");

        StringBuilder sb = new StringBuilder();

        for (Servico s : servicosPet) {
            sb.append(formatarServico(s)).append("\n");
        }

        return sb.toString();
    }

    private String formatarServico(Servico servico) {
        String nome = servico.getNome();
        String data = servico.dataToString();
        String nomeAnimal = servico.getAnimal().getNome();
        int codigo = servico.getCodigo();
        double preco = servico.calculaPreco();

        return String.format("%s\t%s\t%s\t\t%d\tR$ %.2f", nome, data, nomeAnimal, codigo, preco);
    }
}



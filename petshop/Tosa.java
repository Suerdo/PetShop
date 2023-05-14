package petshop;

public class Tosa extends Servico {
    public Tosa(Animal a) {
        super(a);
        this.setNome("Tosa");
    }
    @Override
    public double calculaPreco() {
        double preco = 0;
        switch (getAnimal().getTamanho()) {
            case "p":
                preco += 22;
                break;
            case "m":
                preco += 30;
                break;
            case "g":
                preco += 40;
                break;
            default:
                throw new RuntimeException("Tamanho de animal invalido (p/m/g)");
        }
        // aqui o valor final do preço já foi calculado
        return preco;
    }
}


package petshop;

public class Banho extends Servico {
    public Banho(Animal a){
        super(a);
        this.setNome("Banho");
    }
    public double calculaPreco() {
        double preco = 0;
        switch (getAnimal().getTamanho()){
            case "p" ->{
                preco = 20;
            }
            case "m" -> {
                preco = 30;
            }
            case "g" ->{
                preco = 40;
            }
            default -> {
                throw new RuntimeException("Tamanho do animal invalido:(p/m/g) " + getAnimal().getTamanho());
            }
        }

        switch (getAnimal().getTamanhoPelo()){
            case "curto" ->{

            }
            case "medio", "médio" ->{
                preco += 10;
            }
            case "longo" ->{
                preco += 20;
            }
            default -> {
                throw new RuntimeException("Tamanho do pelo do animal invalido:(curto/médio/longo) " + getAnimal().getTamanhoPelo());
            }
        }

        return preco;
    }
}



package petshop;

public class Hotel extends Servico {
    private double horasPassadas;
    public Hotel(Animal a, double horasPassadas) {
        super(a);
        this.horasPassadas = horasPassadas;
        this.setNome("Hotel");

    }
    public void setHoras(double horasPassadas) {
        this.horasPassadas = horasPassadas;
    }
    public double getHoras(){
        return horasPassadas;
    }
    @Override
    public double calculaPreco() {

        double precoPorHora = 0;
        switch (getAnimal().getTamanho()){
            case "p" -> {
                precoPorHora = 12;
            }
            case "m" -> {
                precoPorHora = 18;
            }
            case "g" ->{
                precoPorHora = 25;
            }
            default -> {
                throw new RuntimeException("Tamanho de animal invalido:(p/m/g) "+getAnimal().getTamanho());
            }
        }
        return horasPassadas * precoPorHora;

    }
}

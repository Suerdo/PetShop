package petshop;

public class Animal {
    private String tamanhoAnimal;
    private String tamanhoPelo;
    private String nomeAnimal;

    public Animal(String tamanhoAnimal,String tamanhoPelo, String nomeAnimal){
        this.tamanhoAnimal= tamanhoAnimal.toLowerCase();
        this.tamanhoPelo = tamanhoPelo.toLowerCase();
        this.nomeAnimal = nomeAnimal;
    }
    public String getTamanho(){
        return tamanhoAnimal;
    }
    public String getTamanhoPelo(){
        return tamanhoPelo;
    }
    public String getNome(){
        return nomeAnimal;
    }
    public void tosado(){
        tamanhoPelo = "curto";
    }

    @Override
    public String toString(){
        return "Animal " +nomeAnimal+ " que tem o tamanho= " +tamanhoAnimal+ " tamanhoPelo= "+tamanhoPelo;
    }

}

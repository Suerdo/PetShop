package petshop;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        boolean aplicacao = true;

        InventarioPetShop inventarioPetShop = new InventarioPetShop();

        while (aplicacao){
            Servico servico = null;
            int entradaUsuario;

            do{
                System.out.print("""
                Digite o serviço:
                1-Banho
                2-Tosa
                3-Hotelzinho
                4-Sair
                >""");

                entradaUsuario = sc.nextInt();
                sc.nextLine();

            }while(entradaUsuario != 1 && entradaUsuario != 2 && entradaUsuario != 3  && entradaUsuario != 4);
            if(entradaUsuario == 4) {
                break;
            }
            Animal animal = criaAnimal();
            String pagar;

            switch (entradaUsuario){
                case 1: {
                    servico = new Banho(animal);
                    System.out.println("O preço do serviço será de: R$"+servico.calculaPreco());
                    inventarioPetShop.addServico(servico);

                    break;
                }

                case 2: {
                    servico = new Tosa(animal);
                    System.out.println("O preço do serviço será de R$"+servico.calculaPreco());
                    inventarioPetShop.addServico(servico);
                    break;
                }

                case 3: {
                    System.out.print("Horas que seu animal ficará no hotel: ");
                    int horas = Integer.parseInt(sc.nextLine());
                    servico = new Hotel(animal, horas);
                    System.out.println("O preço do serviço será de R$" +servico.calculaPreco());
                    inventarioPetShop.addServico(servico);

                    break;
                }

                default: {
                    throw new RuntimeException("Nome de serviço invalido." + servico);
                }

            }
        }

        System.out.println(inventarioPetShop.emitirRelatorio());

        }  public static Animal criaAnimal(){

        Scanner sc = new Scanner(System.in);

        String tamanhoAnimal, nomeAnimal, tamanhoPelo;

        System.out.print("Digite o nome do seu animal: ");
        nomeAnimal = sc.nextLine();

        do {
            System.out.print("Digite o tamanho do seu animal (p/m/g): ");
            tamanhoAnimal = sc.nextLine().toLowerCase();
        }while(!tamanhoAnimal.equals("p") && !tamanhoAnimal.equals("m") && !tamanhoAnimal.equals("g"));

        do {
            System.out.print("Digite o tamanho do pelo do seu animal (curto/médio/longo): ");
            tamanhoPelo = sc.nextLine().toLowerCase();
        }while(!tamanhoPelo.equals("curto") && !tamanhoPelo.equals("medio") && !tamanhoPelo.equals("médio") && !tamanhoPelo.equals("longo"));

        return new Animal(tamanhoAnimal, tamanhoPelo, nomeAnimal);

    }
}


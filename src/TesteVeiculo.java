public class TesteVeiculo {

    public static void realizarManutencao(Veiculo veiculo) {
        System.out.println("Manutencão realizada.");
        veiculo.mover(); // Chamada polimórfica
    }

    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[3];

        frota[0] = new Carro("Volkswagen", "Gol", 2008, 4);
        frota[1] = new Moto("Honda", "CB 125 Fan", 2021, 125);
        frota[2] = new Caminhao("Volvo", "FH 540", 2023, 54500.0);


        for (Veiculo veiculoDaVez : frota) {
            System.out.println("------------------------------------");
            System.out.println("Veículo: " + veiculoDaVez.getMarca() + " " + veiculoDaVez.getModelo());
            System.out.println("Informações completas:");
            veiculoDaVez.exibirInfo(); // Aqui o super.exibirInfo() já estava sendo usado.
            System.out.println();

            realizarManutencao(veiculoDaVez);
            System.out.println("------------------------------------\n");
        }
    }
}
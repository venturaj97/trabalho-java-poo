public class Carro extends Veiculo {

    private int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano); // Chama o construtor de Veiculo
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo() de Veiculo
        System.out.println("Número de portas: " + numeroPortas);
    }

    @Override
    public void mover() {
        super.mover(); // Chama o mover() de Veiculo
        System.out.println("Carro: O carro está em movimento.");
    }
}
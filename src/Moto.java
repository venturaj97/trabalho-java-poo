public class Moto extends Veiculo {

    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano); // Chama o construtor de Veiculo
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo() de Veiculo
        System.out.println("Cilindrada: " + cilindrada);
    }

    @Override
    public void mover() {
        super.mover(); // Chama o mover() de Veiculo
        System.out.println("Moto: A moto está acelerando.");
    }
}
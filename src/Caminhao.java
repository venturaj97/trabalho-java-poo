public class Caminhao extends Veiculo {

    private double capacidadeCarga;

    // Construtor
    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano); // Chama o construtor de Veiculo
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o exibirInfo() de Veiculo
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
    }

    @Override
    public void mover() {
        super.mover(); // Chama o mover() de Veiculo
        System.out.println("Caminhão: O caminhão está transportando a carga.");
    }
}
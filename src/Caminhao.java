public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga);
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga.");
    }

}

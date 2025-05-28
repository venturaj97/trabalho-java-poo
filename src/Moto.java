
public class Moto extends Veiculo {

    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindrada: " + cilindrada);
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando.");
    }
}
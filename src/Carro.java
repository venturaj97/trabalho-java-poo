public class Carro extends Veiculo {

    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + numeroPortas);
    }

    @Override
    public void mover() {
        System.out.println("O carro está dirigindo.");
    }
}
package heranca.aula;

public class Moto extends Veiculo {
    private int numeroRodas = 2;
    private double alturaAssento=80;

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public double getAlturaAssento() {
        return alturaAssento;
    }

    public void setAlturaAssento(double alturaAssento) {
        this.alturaAssento = alturaAssento;
    }
    
    
}

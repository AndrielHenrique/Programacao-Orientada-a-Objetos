
package heranca.aula;

public class Carro extends Veiculo {
    
    private int numeroRodas = 0;
    
    public Carro(int numeroRodas, int velocidade){
        super(velocidade);
        this.numeroRodas = numeroRodas;
    }
    
    public void setRodas(int numeroRodas){
        this.numeroRodas = numeroRodas;
    }
    
    @Override
    public String toString(){
        super.metodoReescrevivel();
        return "numeroRodas:"+numeroRodas;
    }
    
    @Override
    public void metodoReescrevivel(){
        
    }
}

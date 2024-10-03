

package heranca.aula;

public class Veiculo {
    private int velocidade = 0;
    
    public Veiculo(int velocidade){
        this.velocidade = velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    @Override
    public String toString(){
        return "velocidade:"+velocidade;
    }
    
}


package labirinto;
    
public class Sala {
    Sala Norte;
    Sala Sul;
    Sala Leste;
    Sala Oeste;
    
    String mensagem = " ";
    
    public Sala(String msg){
        mensagem = msg;
    }
    public void setSalaNorte(Sala n){
        this.Norte = n;
    }
    
    public void setSalaSul(Sala s){
        this.Sul = s;
    }
    
    public void setSalaLeste(Sala l){
        this.Leste = l;
    }
    
    public void setSalaOeste(Sala o){
        this.Oeste = o;
    }

    
    public Sala getSala(String sala){
        if(sala.equals("Norte")) return Norte;
        else if(sala.equals("Sul")) return Sul;
        else if(sala.equals("Leste")) return Leste;
        else if(sala.equals("Oeste")) return Oeste;
        return null;
    }
    
    @Override
    public String toString(){
        return mensagem;
    }
    
    
}

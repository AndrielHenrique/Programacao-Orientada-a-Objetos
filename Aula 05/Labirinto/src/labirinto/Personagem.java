
package labirinto;

public class Personagem {
    Sala sala;
    
    public void setSala(Sala sala){
        this.sala = sala;
    }
    
    public Sala proximaSala(String direcao){
            if(sala.getSala(direcao) == null){
                System.out.println(sala+":Bateu na parede!");
                return null;
            }
        sala = sala.getSala(direcao);
        mostrarSala();
        return sala;
    }
    
    public void mostrarSala(){
        System.out.println(sala);
    }
}

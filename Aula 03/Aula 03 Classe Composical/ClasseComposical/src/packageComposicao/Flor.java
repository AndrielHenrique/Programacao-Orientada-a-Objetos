package packageComposicao;

public class Flor {
    String nome;
    private Petala p1;
    private Petala p2;
    private Petala p3;
    
    public Flor(){};
    
    public void setP1(Petala p){
        p1 = p;
    }
    public void setP2(Petala p){
        p2 = p;
    }
    public void setP3(Petala p){
        p3 = p;
    }
    public void mostrarPetalas(){
        System.out.println(p1.getCor());
        System.out.println(p2.getCor());
        System.out.println(p3.getCor());
    }
    
    public Flor(Petala a, Petala b, Petala c){
        p1 = a;
        p2 = b;
        p3 = c;
    }
}

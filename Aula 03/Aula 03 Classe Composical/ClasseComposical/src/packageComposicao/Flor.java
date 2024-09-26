package packageComposicao;

public class Flor {
    String nome;
    private Petala[] petalas = new Petala[3];
    private int index = 0;
    
    public Flor(){};
    
    public void adicionaPetala(Petala p){
        petalas[index] = p;
        index++;
    }
    /*public void setP1(Petala p){
        p1 = p;
    }
    public void setP2(Petala p){
        p2 = p;
    }
    public void setP3(Petala p){
        p3 = p;
    }
    */
    public void mostrarPetalas(){
        for(int i = 0; i<petalas.length; i++){
            System.out.println(petalas[i].getCor());
        }
//        System.out.println(p1.getCor());
//        System.out.println(p2.getCor());
//        System.out.println(p3.getCor());
    }
    
    public Flor(Petala a, Petala b, Petala c){
//        p1 = a;p2 = b; p3 = c;
        petalas[0] = a;
        petalas[1] = b;
        petalas[2] = c;
    }
}

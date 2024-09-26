package packageComposicao;

public class Principal {
    
    public static void main (String[] args){
        Petala pa=new Petala();
        pa.setCor("Amarelo");
        
        Petala pb=new Petala();
        pb.setCor("Vermelho");
        
        Petala pc=new Petala();
        pc.setCor("Azul");
        
        Flor geranio = new Flor();
        geranio.setP1(pa);
        geranio.setP2(pb);
        geranio.setP3(pc);
        
        pa = null;
        
        geranio.mostrarPetalas();
        
        System.out.println("");
        
        Flor margarida = new Flor(
                            new Petala("Roxo"),
                            new Petala("Azul"),
                            new Petala("Branco"));
        
        margarida.mostrarPetalas();
    }
}

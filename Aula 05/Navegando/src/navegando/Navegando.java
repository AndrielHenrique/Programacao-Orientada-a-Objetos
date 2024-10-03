package navegando;

public class Navegando {
    
    public static void main(String[] args) {
        No no1 = new No("1");
        No no2 = new No("2");
        No no3 = new No("3");
        No no4 = new No("4");
        no1.setNo(no2);
        no2.setNo(no3);
        no3.setNo(no4);
        no4.setNo(no1);
        
        Nav nave=new Nav();
        nave.setNo(no1);
        nave.mostrarNo();
        for(int i =0;i<50;i++){
            nave.next();
            nave.mostrarNo();
        }
    }
    
}

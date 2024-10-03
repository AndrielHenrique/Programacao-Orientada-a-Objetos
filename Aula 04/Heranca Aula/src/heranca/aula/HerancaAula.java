
package heranca.aula;

public class HerancaAula {

    public static void main(String[] args) {
      Veiculo veiculo = new Veiculo(10);
      Carro carro = new Carro(4,11);
      
      System.out.println(veiculo);
      System.out.println(carro);
      
      imprime(veiculo);
      imprime(carro);
      
      Veiculo av= new Carro(4,12);
      av.metodoReescrevivel();
    }
    
    public static void imprime(Veiculo v){
        System.out.println(v);
    }
    
}

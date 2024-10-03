
package labirinto;
import java.util.Scanner;
public class Navegando {
        
     public static void main(String[] args) {
         Sala porticoEntrada = new Sala("Portico Entrada");
         Sala corredorMortal = new Sala("Corredor Mortal");
         
         porticoEntrada.setSalaSul(corredorMortal);
         corredorMortal.setSalaNorte(porticoEntrada);
         
         Personagem mario = new Personagem();
         mario.setSala(porticoEntrada);
         mario.mostrarSala();
         mario.proximaSala("Norte");
         mario.proximaSala("Sul");
         mario.proximaSala("Norte");
         
         Scanner leitor = new Scanner(System.in);
         
        while(true){
             System.out.println("Qual a proxima sala?\n1-Norte\n2-Sul\n3-Leste\n4-Oeste\n5-Sair");
             int op = leitor.nextInt();
             switch(op){
                 case 1->
                        mario.proximaSala("Norte");
                 case 2-> 
                       mario.proximaSala("Sul");
                 case 3->
                       mario.proximaSala("Leste");
                 case 4->
                       mario.proximaSala("Oeste");
                 case 5->{
                     System.out.println("Saindo");
                     leitor.close();
                     return;
             }
             default-> System.out.println("Opcao invalida,escolha uma op de 1 a 5");
         }
        }
     }
}
    

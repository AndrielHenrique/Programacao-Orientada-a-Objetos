
package javaapplication3;
import java.util.Scanner;


public class JavaApplication3 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       //System.out.println("Digite algo aqui: ");
       //String input=leitor.nextLine();
       //System.out.println(input+" "+input);
       
       System.out.println("Escolha uma opcao de 1 a 4: ");
       int op = leitor.nextInt();
       
       int [][] matriz;
       switch(op){
           case 1 -> {
               System.out.println("Op 1 - Criar Matriz");
               matriz=criarMatriz();
            }
           case 2 -> {
               System.out.println("Op 2 - Preencher a Matriz");
               preencherMatriz(matriz);
            }
           case 3 -> { 
               System.out.println("Op3 - Mostrar a Matriz");
               mostrarMatriz(matriz);
            }
           default -> System.out.println("nenhuma");
       }
       
    }
    public static int criarMatriz(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        int input = leitor.nextInt();
        
        System.out.println("digite as colunas da matriz: ");
        int input2 = leitor.nextInt();
        
        int [][]matriz = new int[input][input2];
        return matriz;
        
    }
    
    public static int preencherMatriz(int[][]mat){
       for(int i=0; i<mat.length; i++){
           System.out.println("Digite o valor: ");
            for(int j = 0; j<[0].mat[0];j++){
             System.out.println("Digite o valor: ");
       }
           return mat;
           
    }
    
    public static void mostrarMatriz(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                System.out.println(mat[i][j]);
            }
        }
        }
    }
}

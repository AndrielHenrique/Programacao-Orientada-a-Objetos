
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // System.out.println("Digite algo aqui: ");
        // String input=leitor.nextLine();
        // System.out.println(input+" "+input);

        int matriz[][] = null;
        while (true) {

            System.out.println("Escolha uma opcao de 1 a 4: ");
            int op = leitor.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Op 1 - Criar Matriz");
                    int[] tamanho = criarMatriz(leitor);
                    System.out.println("A matriz tera " + tamanho[0] + "linhas e " + tamanho[1] + "colunas");
                    matriz = new int[tamanho[0]][tamanho[1]];
                }
                case 2 -> {
                    if (matriz != null) {
                        System.out.println("Op 2 - Preencher a Matriz");
                        preencherMatriz(matriz, leitor);
                    } else {
                        System.out.println("Primeiro crie a matriz na op1");
                    }
                }
                case 3 -> {
                    if (matriz != null) {
                        System.out.println("Op3 - Mostrar a Matriz");
                        mostrarMatriz(matriz);

                    } else {
                        System.out.println("Primeiro crie a matriz na op1");
                    }
                }

                case 4 -> {
                    System.out.println("Sair");
                    leitor.close();
                    return;
                }
                default -> System.out.println("Opcao invalida, escolha uma op de 1 a 4");
            }
        }

    }

    public static int[] criarMatriz(Scanner leitor) {

        System.out.println("Digite o tamanho da matriz: ");
        int inputLinhas = leitor.nextInt();

        System.out.println("digite as colunas da matriz: ");
        int inputColunas = leitor.nextInt();

        return new int[] { inputLinhas, inputColunas };

    }

    public static void preencherMatriz(int[][] mat, Scanner leitor) {
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite o numero pra preencher a linha [" + i + "] e a coluna [" + j + "]: ");
                mat[i][j] = leitor.nextInt();

            }
        }
    }

    public static void mostrarMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

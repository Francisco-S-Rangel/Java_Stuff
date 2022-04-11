package matrizes;

import java.security.SecureRandom;
public class Principal {

    public static void main(String[] args){
        /* array
        int[] numeros;*/

        //Matriz
        int [][] numeros = new int [3][5];

        //constante
        final int linha=3;
        final int coluna=5;

        //Matriz
        int [][] numeros2 = new int [linha][coluna];

        for(int i=0;i<linha;i++){
            for(int y=0;y<coluna;y++){
                numeros2[i][y] = new SecureRandom().nextInt(100);
            }
        }

        for(int i=0;i<linha;i++){
            for(int y=0;y<coluna;y++){
                System.out.printf("%d ", numeros2[i][y]);
            }
            System.out.println();
        }

        final int l=5;
        final int c=10;
        int [][] numeros3 = new int[l][c];

        System.out.println();

        impDados(numeros3, l, c);

    }

    public static void impDados(int [][] mtz, int linhas, int colunas){
        for(int i=0;i<linhas;i++){
            for(int y=0;y<colunas;y++){
                mtz[i][y] = new SecureRandom().nextInt(100);
            }
        }

        for(int i=0;i<linhas;i++){
            for(int y=0;y<colunas;y++){
                System.out.printf("%d ", mtz[i][y]);
            }
            System.out.println();
        }

    }
    
}

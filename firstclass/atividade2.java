package firstclass;

import javax.swing.JOptionPane;

public class atividade2 {
    static int fatorialRecursivo(int n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n*fatorialRecursivo(n-1);
        }
    }
    public static void main(String[] args){
        int n=0;
        String aux;

        aux = JOptionPane.showInputDialog("Insira o valor para as operações:");
        n = Integer.parseInt(aux);

         
        System.out.println(fatorialRecursivo(n));

    }
}
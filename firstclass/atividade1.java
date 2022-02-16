package firstclass;

import javax.swing.JOptionPane;

public class atividade1 {
    public static void main(String[] args){
        String aux;

        aux = JOptionPane.showInputDialog("Insira qualquer valor de sua escolha:");
        double number = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Escolha outro valor de sua escolha:");
        double number2 = Double.parseDouble(aux);
        double resultado;
        aux = JOptionPane.showInputDialog("Escolha o tipo de operação desejada: \n Adição - Digite 1.\nSubtração - Digite 2.\nMultiplicação - Digite 3.\nDivisão - Digite 4.\n Ps: Caso outro valor seja inserido a operação devera ser reiniciada!");
        int escolha = Integer.parseInt(aux);

        if(escolha == 1){
            resultado = number + number2;
            JOptionPane.showMessageDialog(null,"O resultado da soma é "+ resultado);

        }else if(escolha == 2){
            resultado = number - number2;
            JOptionPane.showMessageDialog(null,"O resultado da subtração é "+ resultado);
        }else if(escolha == 3){
            resultado = number * number2;
            JOptionPane.showMessageDialog(null,"O resultado da multiplicação é "+ resultado);
        }else if(escolha ==4){
            resultado = number / number2;
            JOptionPane.showMessageDialog(null,"O resultado da soma é "+ resultado);

        }else{
            JOptionPane.showMessageDialog(null,"Foi inserida uma opção não valida!");
        }
    }
    
}

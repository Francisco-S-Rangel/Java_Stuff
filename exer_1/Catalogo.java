package exer_1;

import javax.swing.JOptionPane;
public class Catalogo {
    public String Popular(){
        // O Catalogo ira retornar o atributo nome_produto para a Classe Produto !
        String aux,resp="undefined";
        aux = JOptionPane.showInputDialog("Escolha seu Carro: \n1-Onix\n2-HB20\n3-Gol");
        if(aux.equals("1")){
            resp = "Onix";
        }else if(aux.equals("2")){
            resp = "HB20";
        }else if(aux.equals("3")){
            resp = "Gol";
        }
        return resp;
    }
    public String Luxo(){
        String aux2,resp2="undefined";
        aux2 = JOptionPane.showInputDialog("Escolha seu Carro: \n1-Ferrari\n2-Lamborguini\n3-Maserati");
        if(aux2.equals("1")){
            resp2 = "Ferrari";
        }else if(aux2.equals("2")){
            resp2 = "Lamborguini";
        }else if(aux2.equals("3")){
            resp2 = "Maserati";
        }
        return resp2;
    }
}

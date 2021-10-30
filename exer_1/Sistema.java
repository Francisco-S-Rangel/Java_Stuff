package exer_1;


import javax.swing.JOptionPane;
public class Sistema {
    Cliente cliente = new Cliente();
    public void PaineldeControle(){
        int aux=0;
        String resp="";
        JOptionPane.showMessageDialog(null,"Nova Carros:");
        resp = JOptionPane.showInputDialog("Sistema Funcionando !!\nQuer pedir ou verificar os dados?\n\nDigite 1 para fazer o cadastro e fazer o pedido!"
        + "\nDigite 2 para verificar os dados !"+"\nDigite 3 para Sair !"+
        "\nObs: Caso qualquer outro valor seja inserido o programa deve ser reiniciado !\n\n");
        
        aux = Integer.parseInt(resp);
        if(aux==1){
            cliente.Cadastrar();
        }else if(aux==2){
            cliente.Verificar();
        }else if(aux==3){
            JOptionPane.showMessageDialog(null,"Obrigado por usar esse Sistema !!\nAté a Proxima.");
        }else{
            JOptionPane.showMessageDialog(null,"Você inseriu um valor que não é valido !!");
        }

    }
    
}

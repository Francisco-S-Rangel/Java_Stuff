package exer_1;


import javax.swing.JOptionPane;
public class Sistema {
    Cliente cliente = new Cliente();
    public void PaineldeControle(){
        JOptionPane.showMessageDialog(null,"Nova Carros:");
            cliente.Cadastrar();
            cliente.Verificar();
    }
    
}

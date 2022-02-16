package conversordemoedas;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Convertor{
    private double dolar;
    private double euro;
    private double libra;
    private double real;
    private int momento;
    private double quantidade;
    private int adquirir;
    private double resultado;
    private String anterior;
    private String posterior;
    static DecimalFormat duascasas = new DecimalFormat("#.##");
    
    public void Requerimento(){
        String auxiliar;
        auxiliar =JOptionPane.showInputDialog("Escolha a moeda que você detem no momento:"
                + "\n1-dolar\n2-euro\n3-libra\n4-real\n\n");
        this.setmomento(Integer.parseInt(auxiliar));
        auxiliar =JOptionPane.showInputDialog("Insira o valor em sua moeda que vc quer converter:\n\n$");
        this.setquantidade(Double.parseDouble(auxiliar));
        auxiliar = JOptionPane.showInputDialog("Escolha a moeda que voce quer adquirir:"
        + "\n1-dolar\n2-euro\n3-libra\n4-real\n\n");
        this.setadquirir(Integer.parseInt(auxiliar));
        Processo();
    }
    private void Processo(){
        switch (this.getmomento()){
            case 1:
                this.setanterior("Dolar");
                this.setdolar(this.getdolar()*this.getquantidade());
                break;
            case 2:
                this.setanterior("Euro");
                this.setdolar((this.getdolar()*this.getquantidade())/this.geteuro());
                break;
            case 3:
                this.setanterior("Libra");
                this.setdolar((this.getdolar()*this.getquantidade())/this.getlibra());
                break;
            case 4:
                this.setanterior("Real");
                this.setdolar((this.getdolar()*this.getquantidade())/this.getreal());
                break;    
        }
        switch(this.getadquirir()){
            case 1:
                this.setposterior("Dolar");
                this.setresultado(this.getdolar());
                break;
            case 2:
                this.setposterior("Euro");
                if(this.getmomento()==2){
                this.setresultado(this.getdolar());
                }else{
                this.setresultado(this.getdolar()*this.geteuro());
                }
                break;
            case 3:
                this.setposterior("Libra");
                if(this.getmomento()==3){
                    this.setresultado(this.getdolar());
                }else{
                this.setresultado(this.getdolar()*this.getlibra());}
                break;
            case 4:
                this.setposterior("Real");
                if(this.getmomento()==4){
                this.setresultado(this.getdolar());
                }else{
                this.setresultado(this.getdolar()*this.getreal());}
                break;
        }
        
    }
      public void Resultado(){
            JOptionPane.showMessageDialog(null,this.getanterior()+  " convertido para "
            + this.getposterior() + " = "+ duascasas.format(this.getresultado()));
        }
    public Convertor(){
        this.setdolar(1);
        this.seteuro(0.83);
        this.setlibra(0.72);
        this.setreal(5.28);
        this.setmomento(0);
        this.setquantidade(0);
        this.setadquirir(0);
        this.setresultado(0);
    }
    private void setdolar(double dolar){
        this.dolar=dolar;
    }
    private double getdolar(){
        return this.dolar;
    }
    private void seteuro(double euro){
        this.euro=euro;
    }
    private double geteuro(){
        return this.euro;
    }
    private void setlibra(double libra){
        this.libra=libra;
    }
    private double getlibra(){
        return this.libra;
    }
    private void setreal(double real){
         this.real=real;
    }
    private double getreal(){
        return this.real;
    }
    private void setmomento(int momento){
        this.momento=momento;
    }
    private int getmomento(){
        return this.momento;
    }
    private void setquantidade(double quantidade){
        this.quantidade = quantidade;
    }
    private double getquantidade(){
        return this.quantidade;
    }
    private void setadquirir(int adquirir){
        this.adquirir=adquirir;
    }
    private int getadquirir(){
        return this.adquirir;
    }
    private void setresultado(double resultado){
        this.resultado=resultado;
    }
    private double getresultado(){
        return this.resultado;
    }
    private void setanterior(String anterior){
        this.anterior=anterior;
    }
    private String getanterior(){
        return this.anterior;
    }
    private void setposterior(String posterior){
        this.posterior=posterior;
    }
    private String getposterior(){
        return this.posterior;
    }
}
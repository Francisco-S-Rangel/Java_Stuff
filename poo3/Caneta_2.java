package poo3;

public class Caneta_2{
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
   
    public Caneta_2(String m, String c, float p,boolean t){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampada = t;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getcor(){
        return this.cor;
    }
    public void setcor(String c){
        this.cor = c ;
    }
    public float getponta(){
        return this.ponta;
    }
    public void setponta(float x){
        this.ponta = x;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
  
    public void getstatus(){
        System.out.printf("\nSobre a Caneta:\n");
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta Tampada: " + this.getTampada());
    }
}

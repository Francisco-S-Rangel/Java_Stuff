package poo;

public class Caneta{
   /*atributos*/
    /*this é o nome to objeto nesse cado c1, this é uma referencia 
    ao proprio objeto que chamou, sempre que vc quiser modeficar um 
    objeto dentro da propria classe que chamou */
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    /*metodo*/
    void status(){
        System.out.println("Modelo?"+this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta?" + this.ponta);
        System.out.println("Carga?" + this.carga);
        System.out.println("Esta tampada?" + this.tampada);
    }
    void rabiscar(){
        if(this.tampada== true){
            System.out.println("Erro! não se pode rabiscar com a caneta tampada.");
        }else{
            System.out.print("Estou rabiscando!!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
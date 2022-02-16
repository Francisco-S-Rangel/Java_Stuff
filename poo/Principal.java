package poo;

public class Principal{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        /*Referencia a atributo*/
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 1;
        /*Referncia a metodo*/
      
        c1.destampar();
        c1.status();
        c1.rabiscar();
       
        System.out.printf("\n\n\n");
        
        Caneta c2 = new Caneta();
        c2.modelo = "FaberCastel";
        c2.cor = "Preta";
        c2.ponta = 0.75f;
        c2.carga = 1;
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}

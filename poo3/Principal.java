package poo3;

public class Principal{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        /*Na ocasião abaixo se usa o metodo acessor para dar valor ao atributo*/
        c1.setModelo("Bic");
        c1.getstatus();
         /*Na ocoasião abaixo se instancia o atributo(modelo) diretamente pela 
        referecia feita ao mesmo, lembrando que o atributo modelo é public, caso
        fosse private não seria possivel fazer a instancia atraves de referencia
        apenas usando um metodo acessor.*/
        c1.modelo= "Faber Castel";
        System.out.println(c1.getModelo());
        c1.setponta(5);
        System.out.println(c1.getponta());
        c1.setponta(0.3f);
        c1.setcor("RED");
        c1.destampar();
        c1.getstatus();
        
        /*Instanciando os valores dos atributos direto nos metodo construtor*/
        Caneta_2 c2 = new Caneta_2("NewPen","Verde",0.4f,true);
        c2.getstatus();
        Caneta_2 c3 = new Caneta_2("ZEN","Vermelho",0.7f,false);
        c3.getstatus();
        
    }
}

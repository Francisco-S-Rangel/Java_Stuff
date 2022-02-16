package poo2;

public class Principal{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC";
        c1.cor = "Vermelho";
        /*c1.ponta = 0.5f; o atributo ponta é privado*/
        /*carga é um atributo protegido no entanto apenas so funcionou 
        pois o metodo main(função princial) está dentro de uma classe(Principal) que
        está utilizando a classe Caneta, caso a classe Caneta não estive-se declarada
        o resultado seria o mesmo de um atributo privado*/
        c1.carga = 80;
        /*tampada é um atributo privado no entanto tampar() e destambar() são 
        metodos protegidos portanto eu estou mudando o valor do atributo privado utilizando 
        um metodo aberto  na classe(no casso caneta) desse mesmo atributo(no caso tampada)*/
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.printf("\n\n\n");
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
}

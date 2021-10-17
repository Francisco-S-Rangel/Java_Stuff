package stack;

public class Stack{
    public static void main(String[] args){
        pilha P1 = new pilha();
        P1.inserir(4);
        P1.inserir(2);
        P1.inserir(12);
        P1.inserir(9);
        P1.imprimir();
        System.out.println(P1.tamanho_pilha());
        System.out.println(P1.maior());
        System.out.println(P1.menor());
        System.out.println(P1.vazia());
        P1.remover_ultimo();
        System.out.println(P1.tamanho_pilha());
        P1.imprimir();
        P1.inserir(45);
        P1.inserir(23);
        P1.inserir(33);
        P1.imprimir();
        P1.esvaziar();
        System.out.println(P1.vazia());
        
    }
}


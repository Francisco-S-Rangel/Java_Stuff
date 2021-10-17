package queue;

public class Queue {
    public static void main(String[] args){
        fila f1 = new fila();
        f1.inserir(34);
        f1.inserir(98);
        f1.inserir(3);
        f1.inserir(89);
        f1.imprimir();
        f1.remover();
        f1.imprimir();
        f1.zerarfila();
        f1.imprimir();
        System.out.println(f1.vazia());
        System.out.println(f1.tamanho_fila());
        f1.inserir(23);
        f1.inserir(8);
        f1.inserir(876);
        f1.inserir(67);
        f1.inserir(243);
        System.out.println(f1.tamanho_fila());
        f1.zerarfila();
        for(int i=0;i<100;i++){
            f1.inserir(100+i);
        }
        System.out.println(f1.cheia());
        System.out.println(f1.tamanho_fila());
        f1.imprimir();
        f1.verificar(185);
    }

}

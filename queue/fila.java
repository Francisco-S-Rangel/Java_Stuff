package queue;

public class fila {
    final int max=100;
    private int primeiro,ultimo,tamanho;
    private int[] estrutura;
    
    fila(){
        this.primeiro=0;
        this.ultimo=0;
        this.tamanho=0;
        this.estrutura = new int[max];
    }
    public void zerarfila(){
        this.primeiro=0;
        this.ultimo=0;
        this.tamanho=0;
    }
    boolean vazia(){
        return (primeiro==ultimo);
    }
    boolean cheia (){
        return (ultimo-primeiro == max);
    }
    void inserir(int item){
        if(cheia()){
            System.out.printf("\nA Fila está cheia!\nPortanto não é possivel"
                    + " aicionar outro elemento.\n");
        }else {
            this.estrutura[ultimo % max] = item;
            this.ultimo++;
            this.tamanho++;
        }
    }
    int remover(){
        if(vazia()){
            System.out.printf("\nA Fila está vazia!\nPortanto não é possivel"
                    + " retirar nenhum elemento.\n ");
            return 0;
        }else {
            this.primeiro++;
            this.tamanho--;
            return (estrutura[(primeiro-1)%max]);
        }
    }
    void imprimir(){
        System.out.printf("\nFila: [");
        for(int i=primeiro;i<ultimo;i++){
             System.out.printf(" "+this.estrutura[i]+" ");
        }
        System.out.printf("]\n");
    }
    int tamanho_fila(){
        return tamanho;
    }
    void verificar(int elemento){
        int aux=0;
        for(int i=primeiro;i<ultimo;i++){
             if(elemento==estrutura[i]){
                aux++;
            }
        }
        if(aux>0){
            System.out.println("\nO elemento " + elemento + " está na fila!\n");
        }else if(aux==0){
            System.out.println("\nO elemento " + elemento + "não está na fila!\n");
        }
     }

}

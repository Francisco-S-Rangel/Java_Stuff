package stack;

public class pilha{
    final int max = 100;
    /* Em Java definimos uma constante com a 
    palavra "final" ao invez de const como em C.
    */
    private int tamanho;
    private int[] estrutura;
    
    pilha(){
        this.tamanho=0;
        this.estrutura = new int[max];
    }
    void esvaziar(){
        this.tamanho = 0;
    }
    boolean cheia(){
        return (tamanho==max);
    }
    boolean vazia(){
        return (tamanho==0);
    }
    void inserir (int dado){
        if(this.cheia()){
            System.out.println("\nA  pilha está cheia!\n");
            System.out.println("\nNão é possivel inserir esse elemento!\n");
        } else{
            this.estrutura[tamanho]= dado;
            tamanho++;
        }
    }
    int remover_ultimo(){
        if(this.vazia()){
            System.out.println("\nA pilha está vazia!\n");
            System.out.println("\nNão é possivel inserir nenhum elemento!\n");
            return 0;
        }else{
            this.tamanho--;
            return estrutura[tamanho];
        }
    }
    void imprimir(){
        System.out.printf("\n[" + this.estrutura[0]);
        for(int i=1;i<tamanho;i++){
            System.out.printf(", "+this.estrutura[i]);
        }
        System.out.printf("]\n");
    }
    int tamanho_pilha(){
        return this.tamanho;
    }
    int maior(){
        int maior=-1;
        for(int i =0; i<tamanho;i++){
            if(maior < estrutura[i]){
                maior = this.estrutura[i];
            }
        }
    return maior;
    }
    int menor() {
        int menor=100000;
        for(int i=0;i<tamanho;i++){
            if(menor > estrutura[i]){
                menor = this.estrutura[i];
            }
        }
    return menor;
    }
    void verificar(int elemento){
        int aux=0;
        for(int i=0;i<tamanho;i++){
            if(elemento==estrutura[i]){
                aux++;
            }
        }
        if(aux>0){
            System.out.println("\nO elemento " + elemento + " está na pilha!\n");
        }else if(aux==0){
            System.out.println("\nO elemento " + elemento + "não está na pilha!\n");
        }
    }
}

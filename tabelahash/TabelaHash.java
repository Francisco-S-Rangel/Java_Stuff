package tabelahash;
import java.util.HashMap;
import java.util.HashSet;
/* A diferença entre o HashMap e o HashSet é que o HashSet não armazena valores
repetidos, ou seja caso seja inserido um mesmo valor, o segundo não sera 
adicionado! */

public class TabelaHash{
    public static void main(String[] args){
        HashMap<Integer,String> letras= new HashMap<Integer,String>();
        
        letras.put(1,"a");
        letras.put(2,"b");
        letras.put(3,"c");
        letras.put(4,"d");
        letras.put(5,"e");
        letras.put(6,"f");
        letras.put(7,"g");
        
        System.out.println(letras.get(2));
        System.out.println(letras);
        
        /* o int i começa com 1 por que a primeira chave vale 1, logo caso 
        começase com 0 o primeiro valor impresso seria nulo!
        */
        for(int i=1;i<=letras.size();i++){
            System.out.println(letras.get(i));
        }
        
        letras.put(8,"h");
        letras.put(9,"i");
        letras.put(10,"j");
        
        letras.remove(9);
        System.out.println(letras);
        letras.clear();
        System.out.println(letras);
        
        /*
        for(int i=1;i<24;i++){
            letras.put(i,"a"+ i);
        }
        
        System.out.println(letras.get(3));
        */
        
        HashSet<String> nomes = new HashSet<String>();
        nomes.add("Francisco");
        nomes.add("Bruna");
        nomes.add("Duda");
        nomes.add("Heithor");
        nomes.add("Michael");
        nomes.add("Francisco");
        
        System.out.println(nomes);
        System.out.println(nomes.add("Heithor")?"SIM":"NÃO");
        System.out.println(nomes.add("Nathan")?"SIM":"NÃO");
        System.out.println(nomes.contains("Duda")?"SIM":"NÃO");
        nomes.remove("Bruna");
        System.out.println(nomes);
        nomes.clear();
    }
}


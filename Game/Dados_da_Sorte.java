package Game;
import java.util.Scanner;

public class Dados_da_Sorte {
    public static void main(String[] args){
        int soma=0,dados=0;
        String continuar, nome;
        DadosMalucos valor;
        valor = new DadosMalucos();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bem vindo ao 'Dados Malucos' !!!");
        System.out.println("Insira seu nome: ");
        nome = entrada.next();
        do{
         System.out.println(nome + " ,quer de jogar: ");
         continuar = entrada.next();
         if(continuar.equals("Sim")|| continuar.equals("sim")){
             System.out.println("Insira a soma que vc pensa que os dois dados vão cair !");
             do{
             System.out.println("Obs: a soma deve ser de 2 a 12: ");
             soma = entrada.nextInt();}while(soma<2||soma>12);
             dados = valor.maluco();
             System.out.println("A soma dos resultados dos 2 dados é : " + dados);
             if(soma==dados){
                 System.out.println("Parabéns,você acertou !!");
             }else{
                 System.out.println("Sinto mas você errou!!");
             }
         }
        }while(continuar.equals("Sim")||continuar.equals("sim"));
        System.out.println("Até a proxíma!");
    }
}
package Aula;

import java.util.Scanner;

public class AulaQuestao6 {
/*    public static void main(String[] args) { //método principal
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite um número:");
        x = ler.nextInt();
        verificaPositivoNegativo(x);

        if(verificaPosNegBool(x)){
            System.out.println("\nÉ positivo! (pelo booleano)");
        } else {
            System.out.println("\nÉ negativo! (pelo booleano)");
        }
        System.out.println("FIM DO MAIN!");


        System.out.println("\n");
        metodoOi();
        //retornaNumero();
        System.out.println(retornaNumero());
    }

    public static void metodoOi(){
        System.out.println("Oi! Chamando o método!");
    }

    public static int retornaNumero(){
        return 5;
    }

    public static void verificaPositivoNegativo(int numero){
        if (numero > 0){
            System.out.println("O número é positivo!");
        }
        else {
            System.out.println("O número é negativo!");
        }
    }

    public static boolean verificaPosNegBool(int numero){
        if (numero > 0){
            return true;
        }
        else {
            return false;
        }
    }*/
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
         int[] numeros = new int[10];

         for (int i = 0; i < 10; i++) {
             System.out.println("Digite o " + (i + 1) + " número:");
             numeros[i] = ler.nextInt();
         }
         // não existe número primo negativo
         // o 1 não é primo;
        // 2 é o número par que é primo;
        // número primo é um número divisível apenas por 1 e por ele mesmo.

        // método de força bruta
/*        for (int i = 0; i < numeros.length; i++){
            int count = 0;
            if (numeros[i] == 2 || numeros[i] == 3){
                System.out.println("O número " + numeros[i] + " é primo!");
            } else{
                for (int j = 1; j <= Math.sqrt(numeros[i]); j+=2){
                    if (numeros[i] % j == 0) count++;
                }
                if (count == 2) {
                    System.out.println("O número " + numeros[i] + " é primo!");
                }
            }
        }*/
/*        long start_time = System.currentTimeMillis();
        //        long finish_time = System.currentTimeMillis() - start_time;
        //        System.out.println("O tempo de execução do método verificar primo lento foi de " + finish_time);
        //        // para conferir o tempo do código.*/

        boolean temPrimo = false;
        for (int i = 0; i < numeros.length; i++) { //percorre seu vetor de números
            if (verificaPrimoRapido(numeros[i])) {
                temPrimo = true;
                break;
            }
        }
        if (temPrimo) System.out.println("Existe um número primo na sequência!");
        else System.out.println("Não existe número primo na sequência!");

        for (int i = 0; i < numeros.length; i++) { //percorre seu vetor de números
            if (verificaPrimoLento(numeros[i])) {
                temPrimo = true;
                break;
            }
        }
        if (temPrimo) System.out.println("Existe um número primo na sequência!");
        else System.out.println("Não existe número primo na sequência!");


    }


    public static boolean verificaPrimoRapido(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2 || x == 3) {
            return true;
        }
        else {
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }





    public static boolean verificaPrimoLento(int x){

        if (x == 2) return true;
        else if (x % 2 == 0) return false;

        int count = 0;
        for (int i = 1; i < x; i += 2) {
            if (x % i == 0){
                count++;
            }
        }

        if (count == 2) return true;
        else return false;
    }
}


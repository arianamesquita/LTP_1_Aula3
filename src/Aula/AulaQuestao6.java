package Aula;

import java.util.Scanner;

public class AulaQuestao6 {
/*    public static void main(String[] args) { //m�todo principal
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite um n�mero:");
        x = ler.nextInt();
        verificaPositivoNegativo(x);

        if(verificaPosNegBool(x)){
            System.out.println("\n� positivo! (pelo booleano)");
        } else {
            System.out.println("\n� negativo! (pelo booleano)");
        }
        System.out.println("FIM DO MAIN!");


        System.out.println("\n");
        metodoOi();
        //retornaNumero();
        System.out.println(retornaNumero());
    }

    public static void metodoOi(){
        System.out.println("Oi! Chamando o m�todo!");
    }

    public static int retornaNumero(){
        return 5;
    }

    public static void verificaPositivoNegativo(int numero){
        if (numero > 0){
            System.out.println("O n�mero � positivo!");
        }
        else {
            System.out.println("O n�mero � negativo!");
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
             System.out.println("Digite o " + (i + 1) + " n�mero:");
             numeros[i] = ler.nextInt();
         }
         // n�o existe n�mero primo negativo
         // o 1 n�o � primo;
        // 2 � o n�mero par que � primo;
        // n�mero primo � um n�mero divis�vel apenas por 1 e por ele mesmo.

        // m�todo de for�a bruta
/*        for (int i = 0; i < numeros.length; i++){
            int count = 0;
            if (numeros[i] == 2 || numeros[i] == 3){
                System.out.println("O n�mero " + numeros[i] + " � primo!");
            } else{
                for (int j = 1; j <= Math.sqrt(numeros[i]); j+=2){
                    if (numeros[i] % j == 0) count++;
                }
                if (count == 2) {
                    System.out.println("O n�mero " + numeros[i] + " � primo!");
                }
            }
        }*/
/*        long start_time = System.currentTimeMillis();
        //        long finish_time = System.currentTimeMillis() - start_time;
        //        System.out.println("O tempo de execu��o do m�todo verificar primo lento foi de " + finish_time);
        //        // para conferir o tempo do c�digo.*/

        boolean temPrimo = false;
        for (int i = 0; i < numeros.length; i++) { //percorre seu vetor de n�meros
            if (verificaPrimoRapido(numeros[i])) {
                temPrimo = true;
                break;
            }
        }
        if (temPrimo) System.out.println("Existe um n�mero primo na sequ�ncia!");
        else System.out.println("N�o existe n�mero primo na sequ�ncia!");

        for (int i = 0; i < numeros.length; i++) { //percorre seu vetor de n�meros
            if (verificaPrimoLento(numeros[i])) {
                temPrimo = true;
                break;
            }
        }
        if (temPrimo) System.out.println("Existe um n�mero primo na sequ�ncia!");
        else System.out.println("N�o existe n�mero primo na sequ�ncia!");


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


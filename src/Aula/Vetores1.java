package Aula;

import javax.swing.*;
import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
       // int nota1, nota2, nota3, nota4;
        Scanner ler = new Scanner(System.in);
        int[] notas = new int[4];
        float media = 0; /*= (notas[0] + notas[1] ... )/ 4*/
        int i;

        for (i = 0; i < 4; i++){
            System.out.println("Entre a nota " + (i + 1) + " :" );
            notas[i] = ler.nextInt();
            media += notas[i];
        }
        media /= i;
        System.out.println("O valor da m�dia �: " + media);

        if (media >= 3 && media < 6) {
            System.out.println("Voc� est� de recupera��o.");
            System.out.println("Entre a nota da recupera��o: ");
            int recup = ler.nextInt();
            float media2 = (media + recup)/2;
            System.out.println("Sua nota final � :" + media2);
            if (media2 >= 6){
                System.out.println("Voc� foi aprovado!");
            } if (media2 < 6) {
                System.out.println("Voc� ter� que repetir de ano.");
            }
        } else if (media >= 6){
            System.out.println("Voc� foi aprovado!");
        }  else {
            System.out.println("Voc� foi reprovado.");
        }


/*        notas[0] = ler.nextInt(0);
        notas[1] = ler.nextInt(1);
        notas[2] = ler.nextInt(2);
        notas[3] = ler.nextInt(3);*/

/*        for (i = 0; i < 4; i++){
        }*/




    }
}

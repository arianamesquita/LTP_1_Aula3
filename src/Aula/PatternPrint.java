package Aula;

import java.util.Arrays;

public class PatternPrint {
    public static void main(String[] args) {
/*        //quadrado
        char[][] quadrado = new char[20][20];

        for (int i = 0; i < 20; i++){
            Arrays.fill(quadrado[i],'.');
        }
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                if (i < 2 || i >= 18){
                    quadrado[i][j] = '#';
                }
                if (j < 2 || j >= 18){
                    quadrado[i][j] = '#';
                }
                System.out.print(quadrado[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();*/
        char[][] circulo = new char [25][25];
        int a;

        for (int i = 0; i < 25; i++){
            Arrays.fill(circulo[i],'.');
        }

        a = (circulo.length - 1)/2;
        int c = 1, d = 4, e = 7, f = 10;
        for (int i = 0; i < circulo.length/12; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - c) && (j <= a + c)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            System.out.println();
            c++;
        }
        for (int i = 3; i > circulo.length/12; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - d) && (j <= a + d)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/8){
                break;
            }
            System.out.println();
            d++;
        }
        System.out.println();
        for (int i = 5; i > circulo.length/8; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - e) && (j <= a + e)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/5){
                break;
            }
            System.out.println();
            e++;
        }
        System.out.println();
        for (int i = 6; i > circulo.length/5; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - f) && (j <= a + f)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/4){
                break;
            }
            System.out.println();
            f--;
        }
        System.out.println();
        for (int i = 9; i > circulo.length/4; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - e) && (j <= a + e)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/3){
                break;
            }
            System.out.println();
            e--;
        }
        System.out.println();
        for (int i =11; i > circulo.length/2; i++){
            for (int j = 0; j < circulo[i].length; j++){
                 if ((j >= a - d) && (j <= a + d)){
                     circulo[i][j] = '#';
                 }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/4){
                break;
            }
            System.out.println();
            d--;
        }
        System.out.println();
        for (int i = 13; i > circulo.length/2; i++){
            for (int j = 0; j < circulo[i].length; j++){
                if ((j >= a - c) && (j <= a + c)){
                    circulo[i][j] = '#';
                }
                System.out.print(circulo[i][j] + "    ");
            }
            if (i > circulo.length/1){
                break;
            }
            System.out.println();
            c--;
        }


    }
}

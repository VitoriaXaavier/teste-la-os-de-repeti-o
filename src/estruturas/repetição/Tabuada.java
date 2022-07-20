package estruturas.repetição;

import java.util.Scanner;

public class Tabuada {
    /*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
    número inteiro entre 1 a 10. O usuario deve informar qual número ele deseja vê.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}

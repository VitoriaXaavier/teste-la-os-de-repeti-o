package estruturas.repetição;

import java.util.Scanner;

public class parImpar {
    /* Faça um programa que peça N números inteiros, calcule e
   mostre a quantidade de números pares e a quantidade de números impares.
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;
            contador++;

        }while (contador < quantidadeNumeros);
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números impares: " + quantidadeImpares);

    }
}

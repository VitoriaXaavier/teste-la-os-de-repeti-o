package estruturas.repetição;

import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
/* Faça um programa que leia 5 números
e informe o maior número junto com a média desses números
 */
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int contador = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;

            contador++;
        }while (contador < 5);

        System.out.println("Maior número digitado foi " + maior);
        System.out.println("A media dos números digitados é de " + (soma/5));
    }
}

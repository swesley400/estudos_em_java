package Leitura;

import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) {
        /*Ler filme favorito*/
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme Favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);


        /* Programa para ler variaveis do Teclado*/
        System.out.println("Digite sua nome 1");
        Scanner recebeNota1 = new Scanner(System.in);
        double nota = recebeNota1.nextDouble();

        System.out.println("Digite sua nome 1");
        Scanner recebeNota2 = new Scanner(System.in);
        double nota3 = recebeNota2.nextDouble();

        double media = (double) (nota + nota3) / 2;

        System.out.println("Sua media é: " + media);

    }
}

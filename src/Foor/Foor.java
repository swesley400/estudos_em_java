package Foor;

import java.util.Scanner;

public class Foor {
    public static void main(String[] args) {
        double mediaAvalicao = 0;
        double nota = 0;
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliaçã  para o filme");
            nota = leitura.nextDouble();
            mediaAvalicao += nota;
        }

        System.out.println(mediaAvalicao / 3);
    }
}

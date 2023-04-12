package While;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        double media  = 0;
        double nota = 0;
        double i = 0;

        Scanner leitura = new Scanner(System.in);

        while (i < 3  ) {
             i ++;
            System.out.println("Digite sua nota: " + i);
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println(media /3);
    }
}

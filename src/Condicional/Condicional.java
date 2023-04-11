package Condicional;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean temPlano = true;
        double nota = 8.1;
        String tipePlan = "Plus";

        if(tipePlan.equals("Plus")  && temPlano) {
            System.out.println("Cliente pode assistir!");
        }else {
            System.out.println("Por favor contrate outro plano");
        }


    }
}

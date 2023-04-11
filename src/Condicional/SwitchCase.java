package Condicional;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class SwitchCase {
    public static void main(String[] args) {
        String[] tipoDePermissao;
        tipoDePermissao = new String[3];

        tipoDePermissao[0] = "ADM";
        tipoDePermissao[1] = "GERENTE";
        tipoDePermissao[2] = "USERCOMUN";

        String userPermission =  tipoDePermissao[2];

        switch (userPermission) {
            case "ADM":
                System.out.println("Tem acesso a tudo");
                break;
            case  "GERENTE":
                System.out.println("Tem acesso a quase tudo");
                break;
            case "USERCOMUN":
                System.out.println("Tem que fazer tudo sem acesso a nada");
                break;
        }
    }
}

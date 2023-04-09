public class TextExamples {
    public static void main(String[] args) {
        String  nome = "Wesley";
        String mensagem = """
                    Olá, %s! 
                    Boas vindas ao curso.
                    Teremos %d aulas para te mostrar o que é preciso 
                """ .formatted(nome, 4);
        System.out.println(mensagem);

    }

}

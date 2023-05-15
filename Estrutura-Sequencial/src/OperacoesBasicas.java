public class OperacoesBasicas {

    public static void entradaDeDados(){

    }

    public static void processamentoDeDados(){

    }

    public static void saidaDeDados(){
        System.out.println("- Saída de Dados");
        System.out.println();
        System.out.println("Para escrever na tela um texto qualquer");
        System.out.println();
        System.out.println("Sem quebra de linha ao final: ");
        System.out.println("System.out.print('Bom dia!');");
        System.out.println("--------------------------------");
        System.out.println("Com quebra de linha ao final:");
        System.out.println("System.out.println('Bom dia!');");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Para escrever o conteúdo de uma variável de algum tipo básico");
        System.out.println("Suponha que uma variável tipo int decladara e iniciada:");
        int y = 32;
        System.out.println("int y = 32;");
        System.out.println("Após isso utilizamos Sout");
        System.out.println("System.out.println(y);");
        System.out.println("Trazendo o valor inserido no y que é");
        System.out.println("Valor inserido na variável:" + y);
        System.out.println();
        System.out.println("Para escrever o conteúdo de uma variável com ponto flutuante");
        System.out.println("Suponha uma variável tipo double declarada e iniciada:");
        double x = 10.35784;
        System.out.println("double x = 10.35784;");
        System.out.println("normal: " + x);
        System.out.printf("2f: %.2f%n", x);
        System.out.printf("4f: %.4f%n", x);
        System.out.println();
        System.out.println("Para concatenar vários elementos em um mesmo comando de escrita");
        System.out.println("Regra geral para PRINT e PRINTLN");
        System.out.println("Elemento1 + Elemento2 + Elemento 3");
        System.out.println();
        String nome = "Lucas";
        int idade = 22;
        double renda = 5000.0;
        System.out.println("Crie as variáveis, nome, idade e renda");
        System.out.println("Insira os valores nas variáveis");
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}

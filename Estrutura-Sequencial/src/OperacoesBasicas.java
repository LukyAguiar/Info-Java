import java.sql.SQLOutput;
import java.util.Scanner;

public class OperacoesBasicas {

    static Scanner sc = new Scanner(System.in);
    public static void entradaDeDados(){

    }

    public static void processamentoDeDados(){
        System.out.println("- Processamento de dados em Java Casting");
        System.out.println();
        System.out.println("REGRA:");
        System.out.println("1) A expressão é calculada ");
        System.out.println("2) O resultado da expressão é armazenado na variável ");
        System.out.println();
        System.out.println("Comando de atribuição");
        System.out.println("Sintaxe:");
        System.out.println("<variável> = <expressão>;");
    }

    public static void exemplosProcessamentoDeDados(){
        int resp;
        System.out.println("Qual exemplo deseja ver? [1 a 5]");
        resp = sc.nextInt();

        switch (resp) {
            case 1:
                System.out.println("Exemplo 01");
                System.out.println();
                System.out.println("int x, y:");
                System.out.println("x = 5;");
                System.out.println("y = 2 * x;");
                System.out.println("x");
                System.out.println("y");
                break;
            case 2:
                System.out.println("Exemplo 02");
                System.out.println("int x;");
                System.out.println("double y;");
                System.out.println("x = 5;");
                System.out.println("y = 2 * x;");
                System.out.println("System.out.println('x')");
                System.out.println("System.out.println('y')");
                break;
            case 3:
                System.out.println("Exemplo 03");
                System.out.println("double B,b,h,area;");
                System.out.println("B = 8.0;");
                System.out.println("b = 6.0;");
                System.out.println("h = 5.0;");
                System.out.println("area = (b + B) / 2 * h");
                System.out.println("System.out.println('area')");
                break;
            case 4:
                System.out.println("Exemplo 04");
                System.out.println("int a,b;");
                System.out.println("double resultado;");
                System.out.println();
                System.out.println("a = 5;");
                System.out.println("b = 2;");
                System.out.println();
                System.out.println("resultado = (double) a / b;");
                System.out.println("System.out.println('resultado')");
                break;
            case 5:
                System.out.println("Exemplo 05");
                System.out.println("double a;");
                System.out.println("int b;");
                System.out.println("a = 5.0");
                System.out.println("b = a;");
                System.out.println("System.out.println('b')");
                break;
            default:
                System.out.println("Número invalido, digite outro:");
        }
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

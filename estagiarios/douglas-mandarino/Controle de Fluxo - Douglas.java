package fundamentos.parte2;

import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {
        Exercicios2 aula = new Exercicios2();
        aula.exercicio1(-1);
        System.out.println(aula.exercicio2("testando codigo novo"));
        System.out.println(aula.exercicio3());
        System.out.println(aula.exercicio4(20));
        System.out.println(aula.exercicio5(5));
        System.out.println(aula.salarioComissao(600, 100));
        aula.salarioFuncionarios();
        aula.retornaMes(3);
        System.out.println(aula.minutos(70));
    }

    public void exercicio1(int numero) {
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("zero");
        }
    }

    // Alterei o nome da variavel que conta os caracteres que nao sao espaco
    public int exercicio2(String frase) {
        int contadorDeCaracteresQueNaoSaoEspaco = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                contadorDeCaracteresQueNaoSaoEspaco++;
            }
        }
        return contadorDeCaracteresQueNaoSaoEspaco;

    }

    public int exercicio3() {
        int total = 0;
        for (int i = 0; i < 9999; i++) {
            total += i;
        }
        return total;
    }

    public int exercicio4(int numero) {
        return exercicio4(numero, 0);
    }

    // Uso interessante de recursividade para resolver o problema
    public int exercicio4(int numero, int total) {
        if (numero == 0) {
            return total;
        } else {
            total += numero;
            return exercicio4(numero - 1, total);
        }

    }

    public int exercicio5(int numero) {
        int total = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public void exercicio6() {
        int total = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                total++;
                System.out.println(i);
            }

        }
        System.out.println("\n\n" + total);
    }

    public double salarioComissao(double salario, double comissao) {
        comissao += comissao *= 0.2;
        return salario + comissao;
    }

    // Bom uso do 'do while'
    public void salarioFuncionarios() {
        double salario = 0, comissao = 0;
        do {
            System.out.println("Digite o salario:");
            salario = new Scanner(System.in).nextDouble();
            System.out.println("Digite a comissao:");
            comissao = new Scanner(System.in).nextDouble();
            System.out.println(salario + comissao);
        } while (salario != 0 && comissao != 0);

    }

    public void retornaMes(int mes) {
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            case 4:
                System.out.println("Abril");
                break;


            case 5:
                System.out.println("Maio");
                break;


            case 6:
                System.out.println("Junho");
                break;


            case 7:
                System.out.println("Julho");
                break;


            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Setembro");
                break;


            case 10:
                System.out.println("Outubro");
                break;


            case 11:
                System.out.println("Novembro");
                break;


            case 12:
                System.out.println("Dezembro");
                break;

        }


    }

    public static int minutos(int segundos) {
        int minutos;
        minutos = segundos / 60;
        return minutos;

    }
}
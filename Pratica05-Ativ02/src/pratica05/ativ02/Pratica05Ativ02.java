/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica05.ativ02;
import java.util.Scanner;

/**
 *
 * @author 32616684
 */
public class Pratica05Ativ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.print("\nNome do aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            int coragem = lerNota(entrada, "Coragem");
            int inteligencia = lerNota(entrada, "Inteligência");
            int ambicao = lerNota(entrada, "Ambição");
            int lealdade = lerNota(entrada, "Lealdade");
            int estrategia = lerNota(entrada, "Estratégia");
            int criatividade = lerNota(entrada, "Criatividade");

            entrada.nextLine();

            Aluno aluno = new Aluno(
                nome,
                idade,
                coragem,
                inteligencia,
                ambicao,
                lealdade,
                estrategia,
                criatividade
            );

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            do {
                System.out.println("\nDigite 0 para sair ou 1 para continuar:");
                opcao = entrada.nextInt();

                if (opcao != 0 && opcao != 1) {
                    System.out.println("Opção inválida!");
                }

            } while (opcao != 0 && opcao != 1);

            entrada.nextLine();
        }

        entrada.close();
    }

    public static int lerNota(Scanner entrada, String atributo) {

        int valor;

        do {
            System.out.print(atributo + " (1 a 10): ");
            valor = entrada.nextInt();

            if (valor < 1 || valor > 10) {
                System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            }

        } while (valor < 1 || valor > 10);

        return valor;
    }
}
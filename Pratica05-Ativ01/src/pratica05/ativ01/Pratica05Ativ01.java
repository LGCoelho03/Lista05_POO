/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica05.ativ01;
import java.util.Scanner;

/**
 *
 * @author 32616684
 */
public class Pratica05Ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        pessoa.calculaIMC();

        System.out.println("\nResultado:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.printf("IMC: %.2f\n", pessoa.getImc());
        System.out.println("Classificação: " + pessoa.informaObesidade());
    }
    
}
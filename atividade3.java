package org.example;
import java.util.Scanner;


public class atividade3 {
    public static void main(String[] args) {
        int contagem = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        while (contagem != 5){
            Scanner input = new Scanner(System.in);
            System.out.println("\nDigite a quantidade produzida na 1ª hora: ");
            p1 = input.nextInt();
            System.out.println("Digite a quantidade produzida na 2ª hora: ");
            p2 = input.nextInt();
            System.out.println("Digite a quantidade produzida na 3ª hora: ");
            p3 = input.nextInt();
            System.out.println("Digite a quantidade produzida na 4ª hora: ");
            p4 = input.nextInt();
            System.out.println("Digite a quantidade produzida na 5ª hora: ");
            p5 = input.nextInt();
            contagem++;
            break;
        }


        int contagemFinal = p1+p2+p3+p4+p5;
        System.out.println("\nA contagem final de peças produzidas nas ultimas 5hrs é: " + contagemFinal + ".");
        double media = (double) contagemFinal / 5;
        System.out.println("\nA média de peças é: " + media + ".");
    }
}

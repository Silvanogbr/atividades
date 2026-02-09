package org.example;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int[] historico = new int[4];
            int i = 0;


            while (i < historico.length){


                int valor;
                while (true) {
                    System.out.println("Digite o estado da máquina (o = parada, 1 = operando)");
                    valor = input.nextInt();


                    if (valor == 0 || valor == 1){
                        break;
                    }
                    System.out.println("Valor invalido! digite outro valor.\n");
                }
                historico[i] = valor;
                i++;
            }
            int contador = 0;
            i = 0;
            while(i < historico.length){
                if (historico[i] == 1) {
                    contador++;
                }
                i++;
            }
            System.out.println("\nA máquina esteve em operação " + contador + " vezes.");
            input.close();
        }
    }
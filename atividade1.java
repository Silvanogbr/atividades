package org.example;
import java.util.Scanner;


public class atividade1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o nome do sensor: ");
        String nSensor = input.nextLine();


        System.out.println("Digite o valor da leitura: ");
        int vLeitura = input.nextInt();


        System.out.println("Sensor " + nSensor + " registrado com o valor " + vLeitura + ".");

        System.out.println("obrigado");
        System.out.println("outra coisa");
        System.out.println("Terceira coisa");
        input.close();
    }


}


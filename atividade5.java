package org.example;
public class atividade5 {
    public static void main(String[] args) {
        double valorBruto = 689;
        double resultado = converterEscala(valorBruto);
        System.out.println("O valor na escala de 0-100% é: " + resultado);
    }

    public static double converterEscala(double valor) {
        if (valor < 0 || valor > 1023) {
            throw new IllegalArgumentException("O valor deve estar entre 0 e 1023.");
        }
        return (valor / 1023.0) * 100;
    }
}
package org.example;


public class atividade2 {
    public static void main(String[] args) {
        int nivelTanque = 89; // Simulação de valor recebido


        if (nivelTanque >= 90){
            System.out.println("\nALERTAAAA! Ta quase vazando essa porra, abra a valvula de escoamento aí😢");
        } else if (nivelTanque < 10) {
            System.out.println("\nALERTAAAA! To quase vazio me enche ai cuzão😒");
        }else{
            System.out.println("\nSistema Estavel😁");
        }
    }
}

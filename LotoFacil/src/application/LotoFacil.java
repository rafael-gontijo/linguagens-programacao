package application;

import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char letraPremiada = 'J';

        int escolha;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numeroEscolhido = sc.nextInt();

                    if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                        System.out.println("Aposta inválida.");
                    } else {
                        int numeroSorteado = random.nextInt(101);

                        if (numeroEscolhido == numeroSorteado) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite uma letra de A a Z: ");
                    char letraEscolhida = Character.toUpperCase(sc.next().charAt(0));

                    if (Character.isLetter(letraEscolhida)) {
                        if (letraEscolhida == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numeroDigitado = sc.nextInt();

                    if (numeroDigitado % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do jogo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        sc.close();
    }
}
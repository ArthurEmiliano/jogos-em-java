package JogoDaForca;

import java.util.Scanner;
import java.util.Random;
import UtilJogos.Continuar;

public class JogoDaForca {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ListaDePalavras listas = new ListaDePalavras();

        while (true) {
            String palavra = listas.animais[random.nextInt(listas.animais.length)];
            int tentativas = 6;
            String palavraExibida = "";

            for (int i = 0; i < palavra.length(); i++) {
                palavraExibida += "_";
            }
            
            System.out.println("Vou escolher uma palavra, tente adivinhar...");
            while (tentativas > 0) {
                DesenharForca.desenhar(tentativas);

                System.out.println("    " + palavraExibida);
                System.out.println("Você possui " + tentativas + " tentativa...");

                System.out.print("Escolha uma letra: ");
                String letra = scanner.nextLine().toLowerCase();

                boolean acertou = false;

                for (int i = 0; i < palavra.length(); i++) {
                    if (letra.equals(String.valueOf(palavra.charAt(i)))) {
                        palavraExibida = palavraExibida.substring(0, i) + letra + palavraExibida.substring(i + 1);
                        acertou = true;
                    }
                }

                if (acertou) {
                    System.out.println("Você acertou a letra " + letra + "!");
                } else {
                    System.out.println("Você errou a letra " + letra + "!");
                    tentativas--;
                }

                if (!palavraExibida.contains("_")) {
                    System.out.println("Parabéns, você ganhou o jogo!");
                    break;
                }
            }

            if (tentativas == 0) {
                DesenharForca.desenhar(0);
                System.out.println("Você perdeu o jogo! A palavra era: " + palavra);
            }

            if (!Continuar.perguntar()) {
                scanner.close();
                break;
            }
        }
        scanner.close();
    }
}
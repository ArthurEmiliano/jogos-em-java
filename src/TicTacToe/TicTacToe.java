package TicTacToe;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import UtilJogos.Continuar;

public class TicTacToe {
	public static void main(String[] args) {
    	Random random = new Random();
    	Scanner scanner = new Scanner(System.in);
		
		String opcoesDeMarcador = "XO";
		
		int[][] combinacoes = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
		
		while(true) {
			String marcador = "";
			String[] tabuleiro = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
			ArrayList<Integer> escolhidos = new ArrayList<>();
			
			System.out.print("Você quer O ou X? ");
			String marcadorPlayer = scanner.nextLine();
			
			marcadorPlayer = marcadorPlayer.toUpperCase();
			
			if (!opcoesDeMarcador.contains(marcadorPlayer)) {
				System.out.println("Escolha inválida, tente novamente...");
				continue;
			}
			
			if (marcadorPlayer.equals("X")) {
				marcador = "O";
			} else {
				marcador = "X";
			}
			
			TabuleiroTicTacToe.desenhar(tabuleiro);
			
			while(true) {
				System.out.print("Qual posição você escolhe? ");
				String escolhaPlayer = scanner.nextLine();
				int posicaoPlayer = Integer.parseInt(escolhaPlayer);
				
				if (posicaoPlayer > 8 || posicaoPlayer < 0) {
					System.out.println("Escolha inválida, tente novamente...");
					continue;
				};
				
				if (escolhidos.contains(posicaoPlayer)) {
					System.out.println("Posição já escolhida..");
					continue;
				}
				
				escolhidos.add(posicaoPlayer);	
				tabuleiro[posicaoPlayer] = marcadorPlayer;
				
				if (VerificadorDeVitoria.verificarVencedor(combinacoes ,tabuleiro, marcadorPlayer)) {
					TabuleiroTicTacToe.desenhar(tabuleiro);
					break;
				}
				
				int escolhaComputador = random.nextInt(8);
				
				while (escolhidos.contains(escolhaComputador)) {
					escolhaComputador = random.nextInt(8);
				};
				
				escolhidos.add(escolhaComputador);
				tabuleiro[escolhaComputador] = marcador;
				TabuleiroTicTacToe.desenhar(tabuleiro);
				
				if (VerificadorDeDerrota.verificarDerrota(combinacoes, tabuleiro, marcador)) {
					TabuleiroTicTacToe.desenhar(tabuleiro);
					break;
				}
				
				if (escolhidos.size() >= 9) {
					System.out.println("Vocês empataram...");
					break;
				}
			}
    		if(!Continuar.perguntar()) {
    			scanner.close();
    			break;
    		}
		}
	}
}
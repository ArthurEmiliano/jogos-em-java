package TicTacToe;

public class VerificadorDeVitoria {
	public static boolean verificarVencedor(int [][] combinacoes, String[] tabuleiro, String marcadorPlayer) {
		for (int[] combinacao : combinacoes) {
		    if (tabuleiro[combinacao[0]] == marcadorPlayer && tabuleiro[combinacao[1]] == marcadorPlayer && tabuleiro[combinacao[2]] == marcadorPlayer) {
		        System.out.println("!!!Você ganhou!!!");
		        return true;
		    }
		}
		return false;
	}
}

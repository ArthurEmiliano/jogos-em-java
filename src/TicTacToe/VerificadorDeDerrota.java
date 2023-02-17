package TicTacToe;

public class VerificadorDeDerrota {
	public static boolean verificarDerrota(int [][] combinacoes, String[] tabuleiro, String marcador) {
		for (int[] combinacao : combinacoes) {
		    if (tabuleiro[combinacao[0]] == marcador && tabuleiro[combinacao[1]] == marcador && tabuleiro[combinacao[2]] == marcador) {
		        System.out.println("Você perdeu ;/");
		        return true;
		    }
		}
		return false;
	}
}

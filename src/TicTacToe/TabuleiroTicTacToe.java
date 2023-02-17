package TicTacToe;

public class TabuleiroTicTacToe {
	public static void desenhar(String[] tabuleiro) {
		System.out.println("╔═══╦═══╦═══╗");
		for (int i = 0; i < tabuleiro.length; i++) {
			if (i == 0 || i == 3 || i == 6) {
				System.out.print("║ " + tabuleiro[i] + " ║");
			} else {
				System.out.print(" " + tabuleiro[i] + " ║");
				if (i == 2 || i == 5) {
					System.out.println();
					System.out.println("╠═══╬═══╬═══╣");
				} else if (i == 8) {
					System.out.println();
					System.out.println("╚═══╩═══╩═══╝");
				}
			}
		}
	}
}

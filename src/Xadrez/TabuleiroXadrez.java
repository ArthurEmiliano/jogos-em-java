package Xadrez;

public class TabuleiroXadrez {
	public static void desenhar(String[] tabuleiro) {
		int i2 = 1;
		
		System.out.println("     A   B   C   D   E   F   G   H  ");
		System.out.println("   ╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗");
		
		for (int i = 0; i < tabuleiro.length; i++) {
			if (i == 0 || i == 8 || i == 16|| i == 24 || i == 32 || i == 40 || i == 48 || i == 56) {
				System.out.print(" " + i2);
				System.out.print(" ║ " + tabuleiro[i] + " ║");
				
				i2 += 1;
			} else {
				System.out.print(" " + tabuleiro[i] + " ║");
				if (i == 7 || i == 15 || i == 23 || i == 31 || i == 39 || i == 47 || i == 55) {
					System.out.println();
					System.out.println("   ╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
				} else if (i == 63) {
					System.out.println();
					System.out.println("   ╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝");
				}
			}
		}
	}
}

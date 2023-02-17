package JogoDaForca;

public class DesenharForca {
    public static void desenhar(int tentativas) {
        System.out.println("  ╔════╗");
        System.out.println("  ║    " + (tentativas < 6 ? "O" : ""));
        System.out.println("  ║   " + (tentativas < 4 ? "/" : "") + (tentativas < 5 ? "|" : "") + (tentativas < 3 ? "\\" : ""));
        System.out.println("  ║   " + (tentativas < 2 ? "/" : "") + " " + (tentativas < 1 ? "\\" : ""));
        System.out.println("  ║");
        System.out.print("══╩══");
	}
}

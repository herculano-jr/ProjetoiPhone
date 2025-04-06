package iPhone;

public class Principal {

	public static void main(String[] args) {
        iPhone smart = new iPhone();

        // Testando Reprodutor Musical
        smart.selecionarMusica("Wherever You Will Go");
        smart.tocar();
        smart.pausar();

        // Testando Aparelho Telefônico
        smart.ligar("118488484545");
        smart.atender();
        smart.iniciarCorreioVoz();

        // Testando Navegador de Internet
        smart.exibirPagina("http://www.google.com");
        smart.adicionarNovaAba();
        smart.atualizarPagina();
    }

}

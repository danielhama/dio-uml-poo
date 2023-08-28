
public class Iphone implements IpodInterface, SafariInterface, TelefoneInterface{

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");		
			
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina...");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");			
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina...");
	}

	@Override
	public void play() {
		System.out.println(	"Tocando...");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausando...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("selecionando musica...");
		
	}


}

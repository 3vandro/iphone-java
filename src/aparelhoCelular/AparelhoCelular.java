package aparelhoCelular;

import iphone.Iphone;

public class AparelhoCelular {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.atender();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.iniciarCorreioVoz();
		iphone.selecionarMusica();
		
		
		
	}
}
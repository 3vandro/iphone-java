package iphone;

import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;
import aparelhoTelefonico.AparelhoTelefonico;


public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
	public void exibirPagina() {
		System.out.println("EXIBIR PÁGINA NO IPHONE");
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONAR NOVA ABA NO IPHONE");
		
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZAR PÁGINA NO IPHONE");
		
	}
	
	public void ligar() {
		System.out.println("LIGAR NO IPHONE");
	}
	public void atender() {
		System.out.println("ATENDER NO IPHONE");
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIAR CORREIO DE VOZ NO IPHONE");
	}


	public void tocar() {
		System.out.println("TOCAR NO IPHONE");
	}
	public void pausar() {
		System.out.println("PAUSAR NO IPHONE");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONAR MUSICA NO IPHONE");
		
	}
}

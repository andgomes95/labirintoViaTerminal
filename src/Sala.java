import java.util.Random;

public class Sala extends Carregador{
	private int contemTroll;
	public int getContemTroll() {
		return contemTroll;
	}
	public void setContemTroll(int contemTroll) {
		this.contemTroll = contemTroll;
	}

	private boolean contemPlayer;
	public boolean isContemPlayer() {
		return contemPlayer;
	}
	public void setContemPlayer(boolean contemPlayer) {
		this.contemPlayer = contemPlayer;
	}

	public Porta portaA;
	public Porta portaB;
	public Porta portaC;
	public Sala(){
		portaA = new Porta();
		portaB = new Porta();
		portaC = new Porta();
	}
	public void geraItens(){
		Random gerador = new Random();
		int valor = gerador.nextInt(1000);
		setOuro(valor);
		valor = gerador.nextInt(100);
		setDiamante(valor);
		//Função random para gerar 0 ou 1, com mais chance de dar 0;
		valor = (int)(gerador.nextFloat()*1.2);
		setMachado(valor);
		valor = (int)(gerador.nextFloat()*1.2);
		setPocoes(valor);
	}
	public void viewSala(){
		System.out.println("Nessa sala há: \n"
							+ "\n OURO:\t\t"+getOuro()+
							".\n DIAMANTE:\t"+getDiamante()+
							".\n MACHADO:\t"+getMachado()+
							".\n POCOES:\t"+getPocoes()+
							".\n CHAVE:\t\t"+getChaves()+
							".\n TROLL: \t"+getContemTroll());
	}
}
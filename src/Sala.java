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

	private Porta portaA;
	private Porta portaB;
	private Porta portaC;
	public Sala(int id){
		setSalaId(id);
		setPortaA(new Porta());
		setPortaB(new Porta());
		setPortaC(new Porta());
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
	public void viewSala(Mapa mapa){
		int i;
		System.out.println("Nessa sala há: \n"
							+ "\n OURO:\t\t"+getOuro()+
							".\n DIAMANTE:\t"+getDiamante()+
							".\n MACHADO:\t"+getMachado()+
							".\n POCOES:\t"+getPocoes()+
							".\n CHAVE:\t\t"+getChaves()+
							".\n TROLL: \t"+getContemTroll());
		if (getContemTroll()>0){
			System.out.println("Os trolls na sala são:");
			for(i=0;i<4;i++){
				if(mapa.getTrolls().get(i).getSalaId()==(getSalaId())){
					System.out.println(mapa.getTrolls().get(i).getName());
				}
			}
		}
	}
	public Porta getPortaA() {
		return portaA;
	}
	public void setPortaA(Porta portaA) {
		this.portaA = portaA;
	}
	public Porta getPortaB() {
		return portaB;
	}
	public void setPortaB(Porta portaB) {
		this.portaB = portaB;
	}
	public Porta getPortaC() {
		return portaC;
	}
	public void setPortaC(Porta portaC) {
		this.portaC = portaC;
	}
}
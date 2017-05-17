import java.util.Random;
/***************************************************************************************************************
 * Classe Porta: A classe tenta fazer uma abstração de uma sala. Esta classe herda a capacidade de carregar itens
 * da classe Carregador
 ***************************************************************************************************************/
public class Sala extends Carregador{
	//Atributo indica se há trolls na sala, e sua quantidade
	private int contemTroll;
	public int getContemTroll() {
		return contemTroll;
	}
	public void setContemTroll(int contemTroll) {
		this.contemTroll = contemTroll;
	}
	//Atributo indica se o player está na sala
	private boolean contemPlayer;
	public boolean isContemPlayer() {
		return contemPlayer;
	}
	public void setContemPlayer(boolean contemPlayer) {
		this.contemPlayer = contemPlayer;
	}
	//Atributos indicam se há portas na sala
	private Porta portaA;
	private Porta portaB;
	private Porta portaC;
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
	
	//Construtor inicia a sala, criando as portas da sua sala
	public Sala(int id){
		setSalaId(id);
		setPortaA(new Porta());
		setPortaB(new Porta());
		setPortaC(new Porta());
	}
	//Este metodo gera randomicamente os itens na sala. 
	public void geraItens(){
		Random gerador = new Random();
		int valor = gerador.nextInt(1000);
		setOuro(valor);
		valor = gerador.nextInt(100);
		setDiamante(valor);
		//Função random para gerar 0 ou 1, com mais chance de dar 0;
		valor = (int)(gerador.nextFloat()*1.5);
		setMachado(valor);
		valor = (int)(gerador.nextFloat()*1.5);
		setPocoes(valor);
	}
	//Este metodo mostra itens disponiveis na sala, se há trolls, e quais trolls estão na sala
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
			for(i=0;i<mapa.getTrolls().size();i++){
				if(mapa.getTrolls().get(i).getSalaId()==(getSalaId())){
					System.out.println(mapa.getTrolls().get(i).getName());
				}
			}
		}
	}
}
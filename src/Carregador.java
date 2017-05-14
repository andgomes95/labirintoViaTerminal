/***************************************************************************************************************
 * Classe Carregador: A classe define objeto que tem a capacidade de carregar itens
 ***************************************************************************************************************/
public class Carregador {
	//Atributo referente a indentificação da sala em que o carregador está 	private int salaId;

	private int salaId;
	public int getSalaId() {
		return this.salaId;
	}
	public void setSalaId(int salaId) {
		this.salaId = salaId;
	}
	
	//Atributo referente aos ouros que o carregador contém
	private int ouro;
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	
	//Atributo referente aos diamantes que o carregador contém
	private int diamante;
	public int getDiamante() {
		return diamante;
	}
	public void setDiamante(int diamante) {
		this.diamante = diamante;
	}
	
	//Atributo referente aos machados que o carregador contém 
	private int machado;
	public int getMachado() {
		return machado;
	}
	public void setMachado(int machado) {
		this.machado = machado;
	}

	//Atributo referente as pocoes que o carregador contém
	private int pocoes;
	public int getPocoes() {
		return pocoes;
	}
	public void setPocoes(int pocoes) {
		this.pocoes = pocoes;
	}
	
	//Atributo referente as chaves que o carregador contém
	private int chaves;
	public int getChaves() {
		return chaves;
	}
	public void setChaves(int chaves) {
		this.chaves = chaves;
	}
	
		
}

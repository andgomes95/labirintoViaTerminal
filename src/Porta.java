public class Porta {
	/***************************************************************************************************************
	 * Classe Porta: A classe tenta fazer uma abstração de uma porta
	 ***************************************************************************************************************/
	//Esse atributo guarda o ID da sala em que a porta aponta
	private int salaId;
	public int getSalaId() {
		return salaId;
	}
	public void setSalaId(int salaId) {
		this.salaId = salaId;
	}
	//Esse atributo indica se a porta está trancada ou não
	private boolean portaTrancada;
	public boolean isPortaTrancada() {
		return portaTrancada;
	}
	public void setPortaTrancada(boolean portaTrancada) {
		this.portaTrancada = portaTrancada;
	}
}

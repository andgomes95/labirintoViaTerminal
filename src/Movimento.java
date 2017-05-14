import java.util.ArrayList;

public class Movimento extends Carregador{
	private boolean fim;
	public boolean isFim() {
		return fim;
	}
	public void setFim(boolean fim) {
		this.fim = fim;
	}
	/* FLAGS DE RETORNO PARA O METODO moveToDoor:
	 * 0 - Movimento executado
	 * 1 - Porta Trancada
	 * 2 - Porta Inexistente
	 * 3 - Opção Inexistente
	 * 4 - Saida
	 */
	public int moveToDoor(ArrayList<Sala> salas,char id){
		switch(id){
		case 'a':
			if(salas.get(getSalaId()).getPortaA().getSalaId() == 1000){
				this.setFim(true);
				return 4;
			}else if((salas.get(getSalaId()).getPortaA().getSalaId() != -1)&&(salas.get(getSalaId()).getPortaA().isPortaTrancada()!= true)){
				setSalaId(salas.get(getSalaId()).getPortaA().getSalaId());
				return 0;
			}else if(salas.get(getSalaId()).getPortaA().isPortaTrancada()){
				return 1;
			}else{
				return 2;
			}
		case 'b':
			if((salas.get(getSalaId()).getPortaB().getSalaId() != -1)&&(salas.get(getSalaId()).getPortaB().isPortaTrancada()!=true)){
				setSalaId(salas.get(getSalaId()).getPortaB().getSalaId());
				return 0;
			}else if(salas.get(getSalaId()).getPortaB().isPortaTrancada()){
				return 1;
			}else{
				return 2;
			}
		case 'c':
			if((salas.get(getSalaId()).getPortaC().getSalaId() != -1)&&(salas.get(getSalaId()).getPortaC().isPortaTrancada()!=true)){
				setSalaId(salas.get(getSalaId()).getPortaC().getSalaId());
				return 0;
			}else if(salas.get(getSalaId()).getPortaC().isPortaTrancada()){
				return 1;
			}else{
				return 2;
			}
		default:
			return 3;
		}
	}
	
	public void pickUpMachado(ArrayList<Sala> salas){
		setMachado(salas.get(getSalaId()).getMachado()+getMachado());
		salas.get(getSalaId()).setMachado(0);
	}
	public void dropMachado(ArrayList<Sala> salas){
		if(getMachado()>0){
			setMachado(getMachado()-1);
			setMachado(salas.get(getSalaId()).getMachado()+1);
		}
	}
	
	public void throwAxe(){
		if (getMachado()>0){
			setMachado(getMachado()-1);
		}
	}
}

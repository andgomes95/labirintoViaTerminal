import java.util.ArrayList;
/***************************************************************************************************************
 * Classe Movimento: A classe define objeto que tem a capacidade de se movimentar, além de carregar itens, 
 * habilidade herdada da classe Carregador
 ***************************************************************************************************************/
public class Movimento extends Carregador{
	/*O metodo moveToDoor é responsavel pela movimentação entre as salas
	 *  FLAGS DE RETORNO PARA O METODO moveToDoor:
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
	//Metodo responsavel por pegar machados disponiveis nas salas 
	public void pickUpMachado(ArrayList<Sala> salas){
		setMachado(salas.get(getSalaId()).getMachado()+getMachado());
		salas.get(getSalaId()).setMachado(0);
	}
	//Metodo responsavel por deixa machados no chão
	public void dropMachado(ArrayList<Sala> salas){
		if(getMachado()>0){
			setMachado(getMachado()-1);
			setMachado(salas.get(getSalaId()).getMachado()+1);
		}
	}
	//Metodo responsavel por arremessar machados
	public void throwAxe(){
		if (getMachado()>0){
			setMachado(getMachado()-1);
		}
	}
}

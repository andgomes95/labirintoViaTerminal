import java.util.ArrayList;

public class Movimento extends Carregador{
	private int salaId;
	private boolean fim;
	public int getSalaId() {
		return salaId;
	}
	public void setSalaId(int salaId) {
		this.salaId = salaId;
	}
	public boolean isFim() {
		return fim;
	}
	public void setFim(boolean fim) {
		this.fim = fim;
	}
	public void moveToDoor(ArrayList<Sala> salas,char id){
		System.out.println(id);
		switch(id){
		case 'a':
			if(salas.get(getSalaId()).portaA.getSalaId() == 1000){
				System.out.println("VOCÊ CHEGOU NA SAIDA");
				this.setFim(true);
			}else if((salas.get(getSalaId()).portaA.getSalaId() != -1)&&(salas.get(getSalaId()).portaA.isPortaTrancada()!= true)){
				setSalaId(salas.get(getSalaId()).portaA.getSalaId());
				
			}else if(salas.get(getSalaId()).portaA.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}
			break;
		case 'b':
			if((salas.get(getSalaId()).portaB.getSalaId() != -1)&&(salas.get(getSalaId()).portaB.isPortaTrancada()!=true)){
				setSalaId(salas.get(getSalaId()).portaB.getSalaId());
			}else if(salas.get(getSalaId()).portaB.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}break;
		case 'c':
			if((salas.get(getSalaId()).portaC.getSalaId() != -1)&&(salas.get(getSalaId()).portaC.isPortaTrancada()!=true)){
				setSalaId(salas.get(getSalaId()).portaC.getSalaId());
			}else if(salas.get(getSalaId()).portaC.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}break;
		default:
			System.out.println("Sala inexistente");
		}
	}
	
	public void pickUpMachado(ArrayList<Sala> salas){
		setMachado(salas.get(getSalaId()).getMachado()+getMachado());
		salas.get(getSalaId()).setMachado(0);
	}
	public void dropMachado(ArrayList<Sala> salas){
		if(getMachado()>0){
			setMachado(getMachado()-1);
			setMachado(salas.get(salaId).machado+1);
		}
	}
	
	
}

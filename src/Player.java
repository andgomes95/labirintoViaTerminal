import java.util.ArrayList;

public class Player extends Movimento{
	public void moveToDoor(ArrayList<Sala> salas,char id){
		int salaOrigem = this.getSalaId();
		super.moveToDoor(salas, id);
		salas.get(salaOrigem).setContemPlayer(false);
		salas.get(this.getSalaId()).setContemPlayer(true);
		
	}
	public void pickUpMachado(ArrayList<Sala> salas){
		if(capacidadeMochila()==true){
			super.pickUpMachado(salas);
		}
	}
	public void pickUpOuro(ArrayList<Sala> salas){
		setOuro(salas.get(getSalaId()).getOuro()+getOuro());
		salas.get(getSalaId()).setOuro(0);
	}
	public void pickUpDiamante(ArrayList<Sala> salas){
		setDiamante(salas.get(getSalaId()).getDiamante()+getDiamante());
		salas.get(getSalaId()).setDiamante(0);
	}
	
	public void pickUpChave(ArrayList<Sala> salas){
		setChaves(salas.get(getSalaId()).getChaves()+getChaves());
		salas.get(getSalaId()).setChaves(0);
	}
	public void dropChave(ArrayList<Sala> salas){
		setChaves(getChaves()-1);
		salas.get(getSalaId()).setChaves(salas.get(getSalaId()).getChaves()+1);
	}
	public void openPorta(Porta porta,ArrayList<Sala> salas){
		if(porta.isPortaTrancada()==true&&getChaves()>1){
			porta.setPortaTrancada(false);
			if(salas.get(porta.getSalaId()).portaA.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaA.setPortaTrancada(false);
			}else if(salas.get(porta.getSalaId()).portaB.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaB.setPortaTrancada(false);
			}else if(salas.get(porta.getSalaId()).portaC.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaC.setPortaTrancada(false);
			}
		}else if (porta.isPortaTrancada()==false){
			System.out.println("A porta não está trancada.");
		}else{
			System.out.println("Você não possui chave.");
		}
	}
	
	public void pickUpPocoes(ArrayList<Sala> salas){
		setPocoes(salas.get(getSalaId()).getPocoes()+getPocoes());
		salas.get(getSalaId()).setPocoes(0);
	}
	public void DropPocoes(ArrayList<Sala> salas){
		setPocoes(getPocoes()-1);
		salas.get(getSalaId()).setPocoes(salas.get(getSalaId()).getPocoes()+1);
	}
	public void closePorta(Porta porta,ArrayList<Sala> salas){
		if(porta.isPortaTrancada()==true){
			System.out.println("A porta está fechada");
		}else if (porta.isPortaTrancada()==false){
			setPocoes(getPocoes()-1);
			porta.setPortaTrancada(true);
			if(salas.get(porta.getSalaId()).portaA.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaA.setPortaTrancada(true);
			}else if(salas.get(porta.getSalaId()).portaB.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaB.setPortaTrancada(true);
			}else if(salas.get(porta.getSalaId()).portaC.getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).portaC.setPortaTrancada(true);
			}
		}
	}
	

	public boolean capacidadeMochila(){
		int total = this.chaves + this.machado + this.pocoes;
		if (total == 5){
			System.out.println("Mochila Cheia");
			return false;
		} else {
			return true;
		}
	}
	public void viewPlayer(){
		System.out.println("O personagem tem: \n"
							+ "\n OURO:\t\t"+getOuro()+
							".\n DIAMANTE:\t"+getDiamante()+
							".\n MACHADO:\t"+getMachado()+
							".\n POCOES:\t"+getPocoes()+
							".\n CHAVE:\t\t"+getChaves()+
							".\n MOCHILA CHEIA?"+!capacidadeMochila());
	}
}

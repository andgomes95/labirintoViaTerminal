import java.util.ArrayList;

public class Player extends Movimento{
	private boolean fim;
	public boolean isFim() {
		return fim;
	}
	public void setFim(boolean fim) {
		this.fim = fim;
	}
	public int moveToDoor(ArrayList<Sala> salas,char id){
		int salaOrigem = this.getSalaId();
		int flag = super.moveToDoor(salas, id);
		if(flag == 0){
			salas.get(salaOrigem).setContemPlayer(false);
			salas.get(this.getSalaId()).setContemPlayer(true);
		}else if(flag == 1){
			System.out.println("A porta está trancada.");
		}else if(flag == 2){
			System.out.println("Não existe esta porta.");
		}else if(flag == 3){
			System.out.println("Opção inexistente.");
		}else if (flag == 4){
			this.setFim(true);
			salas.get(salaOrigem).setContemPlayer(false);
			salas.get(this.getSalaId()).setContemPlayer(true);
		}
		return flag;
	}
	public void pickUpMachado(ArrayList<Sala> salas){
		if(capacidadeMochila()==true){
			super.pickUpMachado(salas);
		}
	}
	public void pickUpOuro(ArrayList<Sala> salas){
		if(salas.get(getSalaId()).getContemTroll()==0){
			setOuro(salas.get(getSalaId()).getOuro()+getOuro());
			salas.get(getSalaId()).setOuro(0);
		}else{
			System.out.println("Há um troll na sala. Não será possivel a remoção do ouro");
		}
	}
	public void pickUpDiamante(ArrayList<Sala> salas){
		if(salas.get(getSalaId()).getContemTroll()==0){
		setDiamante(salas.get(getSalaId()).getDiamante()+getDiamante());
		salas.get(getSalaId()).setDiamante(0);
		}else{
			System.out.println("Há um troll na sala. Não será possivel a remoção do diamante");
		}
	}
	public void dropOuro(ArrayList<Sala> salas){
		salas.get(getSalaId()).setOuro(salas.get(getSalaId()).getOuro()+getOuro());
		setOuro(0);
	}
	public void dropDiamante(ArrayList<Sala> salas){
		salas.get(getSalaId()).setDiamante(salas.get(getSalaId()).getDiamante()+getDiamante());
		setDiamante(0);
	}
	public void pickUpChave(ArrayList<Sala> salas){
		setChaves(salas.get(getSalaId()).getChaves()+getChaves());
		salas.get(getSalaId()).setChaves(0);
	}
	public void dropChave(ArrayList<Sala> salas){
		if(getChaves()>0){
			setChaves(getChaves()-1);
			salas.get(getSalaId()).setChaves(salas.get(getSalaId()).getChaves()+1);
		}
	}
	public void openPorta(Porta porta,ArrayList<Sala> salas){
		if(porta.isPortaTrancada()==true&&getChaves()>0){
			porta.setPortaTrancada(false);
			if(salas.get(porta.getSalaId()).getPortaA().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaA().setPortaTrancada(false);
			}else if(salas.get(porta.getSalaId()).getPortaB().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaB().setPortaTrancada(false);
			}else if(salas.get(porta.getSalaId()).getPortaC().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaC().setPortaTrancada(false);
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
		if(getPocoes()>0){
			setPocoes(getPocoes()-1);
			salas.get(getSalaId()).setPocoes(salas.get(getSalaId()).getPocoes()+1);
		}
	}
	public void closePorta(Porta porta,ArrayList<Sala> salas){
		if(porta.isPortaTrancada()==true){
			System.out.println("A porta está fechada");
		}else if (porta.isPortaTrancada()==false){
			setPocoes(getPocoes()-1);
			porta.setPortaTrancada(true);
			if(salas.get(porta.getSalaId()).getPortaA().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaA().setPortaTrancada(true);
			}else if(salas.get(porta.getSalaId()).getPortaB().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaB().setPortaTrancada(true);
			}else if(salas.get(porta.getSalaId()).getPortaC().getSalaId()==getSalaId()){
				salas.get(porta.getSalaId()).getPortaC().setPortaTrancada(true);
			}
		}
	}
	

	public boolean capacidadeMochila(){
		int total = this.getChaves() + this.getMachado() + this.getPocoes();
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
	public void throwAxe(Mapa mapa,String name){
		int i;
		if(mapa.getSalas().get(getSalaId()).getContemTroll()>0){
			for(i=0;i<4;i++){
				if(mapa.getTrolls().get(i).getName()==name){
					break;
				}
			}
			if(mapa.getTrolls().get(i).getSalaId()==getSalaId()){
				mapa.getTrolls().remove(i);
			}else{
				System.out.println("Este troll não está nessa sala ou não existe");
			}
		}
	}
}

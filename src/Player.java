import java.util.ArrayList;

public class Player extends Movimento{
	public void moveToDoor(ArrayList<Sala> salas,char id){
		int salaOrigem = this.getSalaId();
		super.moveToDoor(salas, id);
		salas.get(salaOrigem).setContemPlayer(false);
		salas.get(this.getSalaId()).setContemPlayer(true);
		
	}
	public void pickUpMachado(ArrayList<Sala> salas,int id){
		if(capacidadeMochila()==true){
			super.pickUpMachado(salas, id);
		}
	}
	public void pickUpOuro(int ouro){
		
	}
	public void pickUpDiamante(int diamante){
		
	}
	
	public void moveToChave(){
		
	}
	public void pickUpChave(){
		
	}
	public void dropChave(){
		
	}
	public void openPorta(){
		
	}
	
	public void moveToPocoes(){
		
	}
	public void pickUpPocoes(){
		
	}
	public void DropPocoes(){
		
	}
	public void closePorta(){
		
	}
	
	public void moveToGold(){
		
	}
	public void moveToDiamante(){
		
	}
	
	public boolean capacidadeMochila(){
		int total = this.chaves + this.machado + this.pocoes;
		if (total == 5){
			return false;
		} else {
			return true;
		}
	}
	
}

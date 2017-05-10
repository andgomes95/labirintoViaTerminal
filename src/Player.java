public class Player extends Movimento{
	public Player(){
		this.salaId = 1;
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

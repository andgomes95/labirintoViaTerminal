
public class Movimento extends Carregador{
	public Movimento(){
		//randomizar
	}
	protected int salaId;
	public void moveToDoor(char porta){
		
	}
	public void moveToMachado(){
		
	}
	public void pickUpMachado(){
		if (this.capacidadeMochila()){
			this.machado = this.machado+1;
		}
	}
	public void dropMachado(){
		this.machado = this.machado-1;
	}
	public void throwMachado(){
		
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

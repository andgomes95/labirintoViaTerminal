
public class Movimento extends Carregador{
	protected int salaId;
	//VERIFICAR FUNÇÃO
	public void moveToDoor(Sala sala,char id){
		switch(id){
		case 'a':
			if((sala.portaA.getSalaId() != 0)&&(sala.portaA.isPortaTrancada())){
				salaId = sala.portaA.getSalaId();
				
			}else if(sala.portaA.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}
		case 'b':
			if((sala.portaB.getSalaId() != 0)&&(sala.portaB.isPortaTrancada())){
				salaId = sala.portaB.getSalaId();
			}else if(sala.portaB.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}
		case 'c':
			if((sala.portaC.getSalaId() != 0)&&(sala.portaC.isPortaTrancada())){
				salaId = sala.portaC.getSalaId();
			}else if(sala.portaC.isPortaTrancada()){
				System.out.println("A porta está trancada.");
			}else{
				System.out.println("Sala inexistente.");
			}
		}
		
	}

	public void moveToAndPickUpMachado(){
		
	}
	public void pickUpMachado(){
		
	}
	public void dropMachado(){
		
	}
	public void throwMachado(){
		
	}
}

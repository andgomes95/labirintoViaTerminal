import java.util.ArrayList;
import java.util.Random;

public class Troll extends Movimento{
	String name;
	public Troll(ArrayList<Sala> salas,String name){
		Random gerador = new Random();
		setSalaId(gerador.nextInt(20));
		salas.get(getSalaId()).setContemTroll(salas.get(getSalaId()).getContemTroll()+1);
		this.name = name;
	}
	public void moveToDoor(ArrayList<Sala> salas){
		Random gerador = new Random();
		int auxiliar,flag=1;
		while(flag>0){
			auxiliar = gerador.nextInt(4);
			if (auxiliar == 1){
				flag = super.moveToDoor(salas, 'a');
			}else if (auxiliar == 2){
				flag = super.moveToDoor(salas, 'b');
			}else if (auxiliar == 3){
				flag = super.moveToDoor(salas, 'c');
			}else if (auxiliar == 0){
				//Repouso
				flag = 0;
			}
		}
		
		if (salas.get(getSalaId()).getMachado()>0){
			pickUpMachado(salas);
		}
		if (salas.get(getSalaId()).isContemPlayer()==true){
			//throwAxe
		}
	}
}

import java.util.ArrayList;

public class Mapa{
	private ArrayList<Sala> salas;
	private int quantidadeSalas;
	
public Mapa(int quantidadeSalas){
		this.quantidadeSalas = quantidadeSalas;
		 setSalas(new ArrayList<Sala>());
		 for (int i=0;i<quantidadeSalas;i++){
			getSalas().add(new Sala());
			getSalas().get(i).geraItens();
		}
		//portas sala 1
		getSalas().get(0).getPortaA().setSalaId(5);
		getSalas().get(0).getPortaB().setSalaId(1);
		getSalas().get(0).getPortaC().setSalaId(-1);
		getSalas().get(0).setContemPlayer(true);
		//portas sala 2
		getSalas().get(1).getPortaA().setSalaId(0);
		getSalas().get(1).getPortaB().setSalaId(2);
		getSalas().get(1).getPortaC().setSalaId(-1);
		//portas sala 3
		getSalas().get(2).getPortaA().setSalaId(1);
		getSalas().get(2).getPortaB().setSalaId(7);
		getSalas().get(2).getPortaC().setSalaId(-1);
		//portas sala 4
		getSalas().get(3).getPortaA().setSalaId(1000);
		getSalas().get(3).getPortaB().setSalaId(4);
		getSalas().get(3).getPortaC().setSalaId(-1);
		//portas sala 5
		getSalas().get(4).getPortaA().setSalaId(9);
		getSalas().get(4).getPortaB().setSalaId(3);
		getSalas().get(4).getPortaC().setSalaId(-1);
		//portas sala 6
		getSalas().get(5).getPortaA().setSalaId(0);
		getSalas().get(5).getPortaB().setSalaId(6);
		getSalas().get(5).getPortaC().setSalaId(-1);
		//portas sala 7
		getSalas().get(6).getPortaA().setSalaId(11);
		getSalas().get(6).getPortaB().setSalaId(5);
		getSalas().get(6).getPortaC().setSalaId(-1);
		getSalas().get(6).setChaves(1);
		//portas sala 8
		getSalas().get(7).getPortaA().setSalaId(12);
		getSalas().get(7).getPortaB().setSalaId(2);
		getSalas().get(7).getPortaC().setSalaId(-1);
		//portas sala 9
		getSalas().get(8).getPortaA().setSalaId(9);
		getSalas().get(8).getPortaB().setSalaId(-1);
		getSalas().get(8).getPortaC().setSalaId(-1);
		//portas sala 10
		getSalas().get(9).getPortaA().setSalaId(8);
		getSalas().get(9).getPortaB().setSalaId(14);
		getSalas().get(9).getPortaC().setSalaId(4);
		//portas sala 11
		getSalas().get(10).getPortaA().setSalaId(11);
		getSalas().get(10).getPortaB().setSalaId(15);
		getSalas().get(10).getPortaC().setSalaId(-1);
		//portas sala 12
		getSalas().get(11).getPortaA().setSalaId(10);
		getSalas().get(11).getPortaB().setSalaId(6);
		getSalas().get(11).getPortaC().setSalaId(12);
		//portas sala 13
		getSalas().get(12).getPortaA().setSalaId(11);
		getSalas().get(12).getPortaB().setSalaId(7);
		getSalas().get(12).getPortaC().setSalaId(-1);
		//portas sala 14
		getSalas().get(13).getPortaA().setSalaId(14);
		getSalas().get(13).getPortaB().setSalaId(18);
		getSalas().get(13).getPortaC().setSalaId(-1);
		//portas sala 15
		getSalas().get(14).getPortaA().setSalaId(13);
		getSalas().get(14).getPortaB().setSalaId(9);
		getSalas().get(14).getPortaC().setSalaId(19);
		//portas sala 16
		getSalas().get(15).getPortaA().setSalaId(10);
		getSalas().get(15).getPortaB().setSalaId(16);
		getSalas().get(15).getPortaC().setSalaId(-1);
		//portas sala 17
		getSalas().get(16).getPortaA().setSalaId(15);
		getSalas().get(16).getPortaB().setSalaId(17);
		getSalas().get(16).getPortaC().setSalaId(-1);
		//portas sala 18
		getSalas().get(17).getPortaA().setSalaId(18);
		getSalas().get(17).getPortaA().setPortaTrancada(true);
		getSalas().get(17).getPortaB().setSalaId(16);
		getSalas().get(17).getPortaC().setSalaId(-1);
		//portas sala 19
		getSalas().get(18).getPortaA().setSalaId(13);
		getSalas().get(18).getPortaB().setSalaId(17);
		getSalas().get(18).getPortaB().setPortaTrancada(true);
		getSalas().get(18).getPortaC().setSalaId(-1);
		//portas sala 20
		getSalas().get(19).getPortaA().setSalaId(11);
		getSalas().get(19).getPortaB().setSalaId(-1);
		getSalas().get(19).getPortaC().setSalaId(-1);

		
	}
	public void printaMapa(){
		for (int i=0;i<quantidadeSalas;i++){
			System.out.println("Sala "+ (i+1) +":\n\n");
			getSalas().get(i).viewSala();
		}
	}
	public ArrayList<Sala> getSalas() {
		return salas;
	}
	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}
}

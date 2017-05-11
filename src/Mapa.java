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
		getSalas().get(0).portaA.setSalaId(5);
		getSalas().get(0).portaB.setSalaId(1);
		getSalas().get(0).portaC.setSalaId(-1);
		getSalas().get(0).setContemPlayer(true);
		//portas sala 2
		getSalas().get(1).portaA.setSalaId(0);
		getSalas().get(1).portaB.setSalaId(2);
		getSalas().get(1).portaC.setSalaId(-1);
		//portas sala 3
		getSalas().get(2).portaA.setSalaId(1);
		getSalas().get(2).portaB.setSalaId(7);
		getSalas().get(2).portaC.setSalaId(-1);
		//portas sala 4
		getSalas().get(3).portaA.setSalaId(1000);
		getSalas().get(3).portaB.setSalaId(4);
		getSalas().get(3).portaC.setSalaId(-1);
		//portas sala 5
		getSalas().get(4).portaA.setSalaId(9);
		getSalas().get(4).portaB.setSalaId(3);
		getSalas().get(4).portaC.setSalaId(-1);
		//portas sala 6
		getSalas().get(5).portaA.setSalaId(0);
		getSalas().get(5).portaB.setSalaId(6);
		getSalas().get(5).portaC.setSalaId(-1);
		//portas sala 7
		getSalas().get(6).portaA.setSalaId(11);
		getSalas().get(6).portaB.setSalaId(5);
		getSalas().get(6).portaC.setSalaId(-1);
		getSalas().get(6).setChaves(1);
		//portas sala 8
		getSalas().get(7).portaA.setSalaId(12);
		getSalas().get(7).portaB.setSalaId(2);
		getSalas().get(7).portaC.setSalaId(-1);
		//portas sala 9
		getSalas().get(8).portaA.setSalaId(9);
		getSalas().get(8).portaB.setSalaId(-1);
		getSalas().get(8).portaC.setSalaId(-1);
		//portas sala 10
		getSalas().get(9).portaA.setSalaId(8);
		getSalas().get(9).portaB.setSalaId(14);
		getSalas().get(9).portaC.setSalaId(4);
		//portas sala 11
		getSalas().get(10).portaA.setSalaId(11);
		getSalas().get(10).portaB.setSalaId(15);
		getSalas().get(10).portaC.setSalaId(-1);
		//portas sala 12
		getSalas().get(11).portaA.setSalaId(10);
		getSalas().get(11).portaB.setSalaId(6);
		getSalas().get(11).portaC.setSalaId(12);
		//portas sala 13
		getSalas().get(12).portaA.setSalaId(11);
		getSalas().get(12).portaB.setSalaId(7);
		getSalas().get(12).portaC.setSalaId(-1);
		//portas sala 14
		getSalas().get(13).portaA.setSalaId(14);
		getSalas().get(13).portaB.setSalaId(18);
		getSalas().get(13).portaC.setSalaId(-1);
		//portas sala 15
		getSalas().get(14).portaA.setSalaId(13);
		getSalas().get(14).portaB.setSalaId(9);
		getSalas().get(14).portaC.setSalaId(19);
		//portas sala 16
		getSalas().get(15).portaA.setSalaId(10);
		getSalas().get(15).portaB.setSalaId(16);
		getSalas().get(15).portaC.setSalaId(-1);
		//portas sala 17
		getSalas().get(16).portaA.setSalaId(15);
		getSalas().get(16).portaB.setSalaId(17);
		getSalas().get(16).portaC.setSalaId(-1);
		//portas sala 18
		getSalas().get(17).portaA.setSalaId(18);
		//getSalas().get(17).portaA.setPortaTrancada(true);
		getSalas().get(17).portaB.setSalaId(16);
		getSalas().get(17).portaC.setSalaId(-1);
		//portas sala 19
		getSalas().get(18).portaA.setSalaId(13);
		getSalas().get(18).portaB.setSalaId(17);
		//getSalas().get(18).portaB.setPortaTrancada(true);
		getSalas().get(18).portaC.setSalaId(-1);
		//portas sala 20
		getSalas().get(19).portaA.setSalaId(11);
		getSalas().get(19).portaB.setSalaId(-1);
		getSalas().get(19).portaC.setSalaId(-1);

		
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

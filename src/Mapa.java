import java.util.ArrayList;

public class Mapa{
	private ArrayList<Sala> salas;
	private int quantidadeSalas;
	public Mapa(int quantidadeSalas){
		this.quantidadeSalas = quantidadeSalas;
		 salas = new ArrayList<Sala>();
		 for (int i=0;i<quantidadeSalas;i++){
			salas.add(new Sala());
			salas.get(i).geraItens();
		}
		//portas sala 1
		salas.get(0).portaA.setSalaId(5);
		salas.get(0).portaB.setSalaId(1);
		//portas sala 2
		salas.get(1).portaA.setSalaId(0);
		salas.get(1).portaB.setSalaId(2);
		//portas sala 3
		salas.get(2).portaA.setSalaId(1);
		salas.get(2).portaB.setSalaId(7);
		//portas sala 4
		salas.get(3).portaA.setSalaId(1000);
		salas.get(3).portaB.setSalaId(4);
		//portas sala 5
		salas.get(4).portaA.setSalaId(9);
		salas.get(4).portaB.setSalaId(3);
		//portas sala 6
		salas.get(5).portaA.setSalaId(0);
		salas.get(5).portaB.setSalaId(6);
		//portas sala 7
		salas.get(6).portaA.setSalaId(11);
		salas.get(6).portaB.setSalaId(5);
		salas.get(6).setChaves(1);
		//portas sala 8
		salas.get(7).portaA.setSalaId(12);
		salas.get(7).portaB.setSalaId(2);
		//portas sala 9
		salas.get(8).portaA.setSalaId(9);
		//portas sala 10
		salas.get(9).portaA.setSalaId(8);
		salas.get(9).portaB.setSalaId(14);
		salas.get(9).portaC.setSalaId(4);
		//portas sala 11
		salas.get(10).portaA.setSalaId(11);
		salas.get(10).portaB.setSalaId(15);
		//portas sala 12
		salas.get(11).portaA.setSalaId(10);
		salas.get(11).portaB.setSalaId(6);
		salas.get(11).portaC.setSalaId(12);
		//portas sala 13
		salas.get(12).portaA.setSalaId(11);
		salas.get(12).portaB.setSalaId(7);
		//portas sala 14
		salas.get(13).portaA.setSalaId(14);
		salas.get(13).portaB.setSalaId(18);
		//portas sala 15
		salas.get(14).portaA.setSalaId(13);
		salas.get(14).portaB.setSalaId(9);
		salas.get(14).portaC.setSalaId(19);
		//portas sala 16
		salas.get(15).portaA.setSalaId(10);
		salas.get(15).portaB.setSalaId(16);
		//portas sala 17
		salas.get(16).portaA.setSalaId(15);
		salas.get(16).portaB.setSalaId(17);
		//portas sala 18
		salas.get(17).portaA.setSalaId(18);
		salas.get(17).portaA.setPortaTrancada(true);
		salas.get(17).portaB.setSalaId(16);
		//portas sala 19
		salas.get(18).portaA.setSalaId(13);
		salas.get(18).portaB.setSalaId(17);
		salas.get(18).portaB.setPortaTrancada(true);
		//portas sala 20
		salas.get(19).portaA.setSalaId(11);


		
	}
	public void printaMapa(){
		for (int i=0;i<quantidadeSalas;i++){
			System.out.println("Sala "+ (i+1) +":\n\n");
			salas.get(i).viewSala();
		}
	}
}

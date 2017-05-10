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
		
	}
	public void printaMapa(){
		for (int i=0;i<quantidadeSalas;i++){
			System.out.println("Sala "+ (i+1) +":\n\n");
			salas.get(i).viewSala();
		}
	}
}

public class Jogo{
	//MODULARIZAR MAIN
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = Instrucao.leitura();
		while (player.isFim()==false){
			//player.viewPlayer();
			if (leitura[0].equals("moveTo")){
				leitura = Instrucao.moveTo(leitura[1],player,mapa);
			}else if(leitura[0].equals("drop")){
				//IMPLEMENTAR
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("throwAxe")){
				//IMPLEMENTAR
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("view")){
				mapa.getSalas().get(player.getSalaId()).viewSala();
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("openDoor")){
				//IMPLEMENTAR
			}else if(leitura[0].equals("closeDoor")){
				//IMPLEMENTAR
			}else if(leitura[0].equals("viewKit")){
				player.viewPlayer();
				leitura = Instrucao.leitura();
			}
			else{
				System.out.println("Instrução não conhecida.");
				leitura = Instrucao.leitura();
			}
			
		}
	}
} 

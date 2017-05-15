public class Jogo{
	//Função principal, em que o jogo é executado
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = Instrucao.leitura();
		while (player.isFim()==false){
			if (leitura[0].equals("moveTo")){
				leitura = Instrucao.moveTo(leitura[1],player,mapa);
			}else if(leitura[0].equals("drop")){
				Instrucao.dropItem(leitura[1], player, mapa);
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("throwAxe")){
				player.throwAxe(mapa,leitura[1]);
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("view")){
				mapa.getSalas().get(player.getSalaId()).viewSala(mapa);
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("openDoor")){
				Instrucao.openDoor(mapa, player, leitura[1]);
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("closeDoor")){
				Instrucao.closeDoor(mapa,player,leitura[1]);
				leitura = Instrucao.leitura();
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
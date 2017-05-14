public class Jogo{
	//MODULARIZAR MAIN
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = Instrucao.leitura();
		int i;
		while (player.isFim()==false){
			if (leitura[0].equals("moveTo")){
				leitura = Instrucao.moveTo(leitura[1],player,mapa);
			}else if(leitura[0].equals("drop")){
				leitura = Instrucao.dropItem(leitura[1], player, mapa);
			}else if (leitura[0].equals("throwAxe")){
				player.throwAxe(mapa,leitura[1]);
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("view")){
				mapa.getSalas().get(player.getSalaId()).viewSala(mapa);
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("openDoor")){
				if(leitura[1].equals("a")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaA(), mapa.getSalas());
				}else if(leitura[1].equals("b")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaB(), mapa.getSalas());
				}else if(leitura[1].equals("c")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaC(), mapa.getSalas());
				}
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("closeDoor")){
				if(leitura[1].equals("a")){
					player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaA(), mapa.getSalas());
				}else if(leitura[1].equals("b")){
					player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaB(), mapa.getSalas());
				}else if(leitura[1].equals("c")){
					player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaC(), mapa.getSalas());
				}
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("viewKit")){
				player.viewPlayer();
				leitura = Instrucao.leitura();
			}
			else{
				System.out.println("Instrução não conhecida.");
				leitura = Instrucao.leitura();
			}
			for (i=0;i<4;i++){
				mapa.getTrolls().get(i).moveToDoor(mapa.getSalas(),player);
			}
		}
	}
} 

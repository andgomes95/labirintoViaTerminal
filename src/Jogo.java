public class Jogo{
	//MODULARIZAR MAIN
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = Instrucao.leitura();
		while (player.isFim()==false){
			if (leitura[0].equals("moveTo")){
				leitura = Instrucao.moveTo(leitura[1],player,mapa);
			}else if(leitura[0].equals("drop")){
				leitura = Instrucao.dropItem(leitura[1], player, mapa);
			}else if (leitura[0].equals("throwAxe")){
				//IMPLEMENTAR
				leitura = Instrucao.leitura();
			}else if (leitura[0].equals("view")){
				mapa.getSalas().get(player.getSalaId()).viewSala();
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("openDoor")){
				if(leitura[1].equals("a")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).portaA, mapa.getSalas());
				}else if(leitura[1].equals("b")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).portaB, mapa.getSalas());
				}else if(leitura[1].equals("c")){
					player.openPorta(mapa.getSalas().get(player.getSalaId()).portaC, mapa.getSalas());
				}
				leitura = Instrucao.leitura();
			}else if(leitura[0].equals("closeDoor")){
				if(leitura[1].equals("a")){
					System.out.println("ENTRA AQUI");
					player.closePorta(mapa.getSalas().get(player.getSalaId()).portaA, mapa.getSalas());
				}else if(leitura[1].equals("b")){
					player.closePorta(mapa.getSalas().get(player.getSalaId()).portaB, mapa.getSalas());
				}else if(leitura[1].equals("c")){
					player.closePorta(mapa.getSalas().get(player.getSalaId()).portaC, mapa.getSalas());
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
			
		}
	}
} 

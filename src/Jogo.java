import java.util.Scanner;
/***************************************************************************************************************
 * Classe Carregador: A classe contém a função principal, além de ter metodos que direcionam o jogo de acordo com
 * as instruções dadas
 ***************************************************************************************************************/
public class Jogo{
	//Metodo que transforma a primeira letra de uma string em char
		public static char retiraLetra(String nome) {
		    if (nome != null && nome.length() > 0) {
		        return nome.charAt(0);
		    }
		    return (char) 0;
		}
		//Metodo que lê a instrução via terminal
		public static String[] leitura(){
			String leituraTerminal = new String();
			String instrucoes[] = new String[3];
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(System.in);
			System.out.println("Player >");
			leituraTerminal = ler.nextLine();
			instrucoes=leituraTerminal.split(" ");
			return instrucoes;
		}
		//Metodo que trata instruções de moveTo para alguma porta
		public static String[] moveToDoor(String destino,Player player,Mapa mapa){
			String[] leitura = new String[3];
			if(destino.equals("a")||destino.equals("b")||destino.equals("c")){
				leitura = leitura();
				if(leitura.length==1&&leitura[0].equals("exit")){
					player.moveToDoor(mapa.getSalas(), retiraLetra(destino));
					for (int i=0;i<mapa.getTrolls().size();i++){
						mapa.getTrolls().get(i).moveToDoor(mapa.getSalas(),player);
					}
					if(player.isFim()==false)
						leitura = leitura();
					return leitura;
				}else{
					return leitura;
				}
			}else{
				System.out.println("Porta inexistente.");
				leitura = leitura();
				return leitura;
			}
		}
		//Metodo que trata instruções de moveTo, sem ser trocas de salas
		public static String[] moveTo(String destino,Player player,Mapa mapa){
			String[] leitura = new String[3];
			switch(destino){
			case "gold":
				leitura = leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("gold")){
						player.pickUpOuro(mapa.getSalas());
						leitura = leitura();
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				return leitura;
			case "diamond":
				leitura = leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("diamond")){
						player.pickUpDiamante(mapa.getSalas());
						leitura = leitura();
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				return leitura;
			case "axe":
				leitura = leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("axe")){
						player.pickUpMachado(mapa.getSalas());
						leitura = leitura();
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				return leitura;
			case "potion":
				leitura = leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("potion")){
						player.pickUpPocoes(mapa.getSalas());
						leitura = leitura();
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				return leitura;
			case "key":
				leitura = leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("key")){
						player.pickUpChave(mapa.getSalas());
						leitura = leitura();
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				return leitura;
			default:
				System.out.println("Não é possivel mover para este local");
				leitura = leitura();
				return leitura;
			}
		
		}
		//Metodo que trata instruções de largar itens
		public static void dropItem(String item,Player player,Mapa mapa){
			switch(item){
			case "gold":
				player.dropOuro(mapa.getSalas());
				break;
			case "diamond":
				player.dropDiamante(mapa.getSalas());
				break;
			case "axe":
				player.dropMachado(mapa.getSalas());
				break;
			case "potion":
				player.dropPocoes(mapa.getSalas());
				break;
			case "key":
				player.dropChave(mapa.getSalas());
				break;
			default:
				System.out.println("Não existe este item");
			}
		}
		//Metodo que trata instrução de abrir porta
		public static void openDoor(Mapa mapa, Player player,String porta){
			if(porta.equals("a")){
				player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaA(), mapa.getSalas());
			}else if(porta.equals("b")){
				player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaB(), mapa.getSalas());
			}else if(porta.equals("c")){
				player.openPorta(mapa.getSalas().get(player.getSalaId()).getPortaC(), mapa.getSalas());
			}else{
				System.out.println("Porta não existe.");
			}
		}
		//Metodo que trata instrução de fechar porta
		public static void closeDoor(Mapa mapa,Player player,String porta){
			if(porta.equals("a")){
				player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaA(), mapa.getSalas());
			}else if(porta.equals("b")){
				player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaB(), mapa.getSalas());
			}else if(porta.equals("c")){
				player.closePorta(mapa.getSalas().get(player.getSalaId()).getPortaC(), mapa.getSalas());
			}else{
				System.out.println("Porta não existe.");
			}
		}
	//Função principal, em que o jogo é executado
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = leitura();
		while (player.isFim()==false){
			if (leitura[0].equals("moveTo")){
				if(leitura.length==3){
					if(leitura[2].equals("door"))
						leitura = moveToDoor(leitura[1],player,mapa);
					else{
						System.out.println("Instrução desconhecida");
						leitura = leitura();
					}
				}else if(leitura.length==2){
					leitura = moveTo(leitura[1],player,mapa);
				}
			}else if(leitura.length==2){
				if(leitura[0].equals("drop")){
					dropItem(leitura[1], player, mapa);
					leitura = leitura();
				}else if (leitura[0].equals("throwAxe")){
					player.throwAxe(mapa,leitura[1]);
					leitura = leitura();
				}else if(leitura[0].equals("openDoor")){
					openDoor(mapa, player, leitura[1]);
					leitura = leitura();
				}else if(leitura[0].equals("closeDoor")){
					closeDoor(mapa,player,leitura[1]);
					leitura = leitura();
				}else{
					System.out.println("Instrução não conhecida");
				}
			}else if(leitura.length==1){
				if (leitura[0].equals("view")){
					mapa.getSalas().get(player.getSalaId()).viewSala(mapa);
					leitura = leitura();
				}else if(leitura[0].equals("viewKit")){
					player.viewPlayer();
					leitura = leitura();
				}else{
					System.out.println("Instrução não conhecida");
					leitura = leitura();
				}
			}else{
				System.out.println("Instrução não conhecida.");
				leitura = leitura();
			}
		}
		System.out.println("FIM DE JOGO");
		player.viewPlayer();
	}
} 
import java.util.Scanner;
/***************************************************************************************************************
 * Classe Instrução: Classe que tem metodos que realiza instruções enviadas pelo terminal
 ***************************************************************************************************************/
public class Instrucao {
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
	//Metodo que trata instruções de moveTo
	public static String[] moveTo(String destino,Player player,Mapa mapa){
		String[] leitura = new String[3];
		int i;
		if(destino.equals("a")||destino.equals("b")||destino.equals("c")){
			player.moveToDoor(mapa.getSalas(), retiraLetra(destino));
			for (i=0;i<4;i++){
				mapa.getTrolls().get(i).moveToDoor(mapa.getSalas(),player);
			}
			if(player.isFim()==false)
				leitura = Instrucao.leitura();
			return leitura;
		}else{
			switch(destino){
			case "gold":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("gold")){
						player.pickUpOuro(mapa.getSalas());
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "diamond":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("diamond")){
						player.pickUpDiamante(mapa.getSalas());
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "axe":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("axe")){
						player.pickUpMachado(mapa.getSalas());
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "potion":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("potion")){
						player.pickUpPocoes(mapa.getSalas());
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "key":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("key")){
						player.pickUpChave(mapa.getSalas());
					}else {
						System.out.println("Não é possivel pegar este item: "+leitura[1]);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			default:
				System.out.println("Não é possivel mover para este local");
				leitura = Instrucao.leitura();
				return leitura;
			}
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
			player.DropPocoes(mapa.getSalas());
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
}
import java.util.Scanner;

public class Instrucao {
	
	public char ultimaLetra(String nome) {
	    if (nome != null && nome.length() > 0) {
	        return nome.charAt(nome.length() - 1);
	    }
	    return (char) 0;
	}
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
	public static String[] moveTo(String destino,Player player,Mapa mapa){
		String[] leitura = new String[3];
		if(destino.equals("a")||destino.equals("b")||destino.equals("c")){
			switch(destino){
			case "a":
				player.moveToDoor(mapa.getSalas(),'a');
				break;
			case "b":
				player.moveToDoor(mapa.getSalas(),'b');
				break;
			case "c":
				player.moveToDoor(mapa.getSalas(),'c');
				break;
			default:
				System.out.println("Porta Inexistente.");
				break;
			}
			leitura = Instrucao.leitura();
			return leitura;
		}else{
			switch(destino){
			case "gold":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("gold")){
						player.pickUpOuro(0);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "diamond":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("diamond")){
						player.pickUpDiamante(0);
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "axe":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("axe")){
						player.pickUpMachado(mapa.getSalas());
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "potion":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("potion")){
						player.pickUpPocoes();
					}
				}
				leitura = Instrucao.leitura();
				return leitura;
			case "key":
				leitura = Instrucao.leitura();
				if (leitura[0].equals("pickUp")){
					if(leitura[1].equals("key")){
						player.pickUpChave();
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
}

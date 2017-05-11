import java.util.Scanner;

public class Jogo{
	public static char ultimaLetra(String nome) {
	    if (nome != null && nome.length() > 0) {
	        return nome.charAt(nome.length() - 1);
	    }
	    return (char) 0;
	}
	public static String[] leitura(){
		String leituraTerminal = new String();
		String instrucoes[] = new String[3];
		Scanner ler = new Scanner(System.in);
		System.out.println("Player >");
		leituraTerminal = ler.nextLine();
		instrucoes=leituraTerminal.split(" ");
		return instrucoes;
	}
	//MODULARIZAR MAIN
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		String[] leitura = new String[3];
		leitura = leitura();
		while (player.isFim()==false){
			player.viewPlayer();
			if (leitura[0].equals("moveTo")){
				if(leitura[1].equals("a")||leitura[1].equals("b")||leitura[1].equals("c")){
					System.out.println("here");
					switch(leitura[1]){
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
					leitura = leitura();
				}else{
					switch(leitura[1]){
					case "gold":
						leitura = leitura();
						if (leitura[0].equals("pickUp")){
							if(leitura[1].equals("gold")){
								player.pickUpOuro(0);
							}
						}
						leitura = leitura();
						break;
					case "diamond":
						leitura = leitura();
						if (leitura[0].equals("pickUp")){
							if(leitura[1].equals("diamond")){
								player.pickUpDiamante(0);
							}
						}
						leitura = leitura();
						break;
					case "axe":
						System.out.println("here");
						leitura = leitura();
						if (leitura[0].equals("pickUp")){
							if(leitura[1].equals("axe")){
								player.pickUpMachado(mapa.getSalas(),player.getSalaId());
							}
						}
						leitura = leitura();
						break;
					case "potion":
						leitura = leitura();
						if (leitura[0].equals("pickUp")){
							if(leitura[1].equals("potion")){
								player.pickUpPocoes();
							}
						}
						leitura = leitura();
						break;
					case "key":
						leitura = leitura();
						if (leitura[0].equals("pickUp")){
							if(leitura[1].equals("key")){
								player.pickUpChave();
							}
						}
						leitura = leitura();
						break;
					default:
						System.out.println("Não é possivel mover para este local");
						leitura = leitura();
						break;
					}
				}
			}else if(leitura[0].equals("drop")){
				//IMPLEMENTAR
				leitura = leitura();
			}else if (leitura[0].equals("throwAxe")){
				//IMPLEMENTAR
				leitura = leitura();
			}else if (leitura[0].equals("view")){
				//IMPLEMENTAR
				leitura = leitura();
			}else{
				System.out.println("Instrução não conhecida.");
				leitura = leitura();
			}
			
		}
	}
} 

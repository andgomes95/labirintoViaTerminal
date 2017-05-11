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
		String instrucoes[] = new String[2];
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
		int a = 0;
		leitura = leitura();
		while (player.isFim()==false){
			if (leitura[0] == "moveTo"){
				if(leitura[2]!=null){
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
						System.out.println("Porta Inexistente");
						break;
					}
					leitura = leitura();
				}else{
					switch(leitura[1]){
					case "gold":
						leitura = leitura();
						if (leitura[0]=="pickUp"){
							if(leitura[1]=="gold"){
								player.pickUpOuro();
							}
						}
						leitura = leitura();
						break;
					case "diamond":
						leitura = leitura();
						if (leitura[0]=="pickUp"){
							if(leitura[1]=="diamond"){
								player.pickUpDiamante();
							}
						}
						leitura = leitura();
						break;
					case "axe":
						leitura = leitura();
						if (leitura[0]=="pickUp"){
							if(leitura[1]=="axe"){
								player.pickUpMachado();
							}
						}
						leitura = leitura();
						break;
					case "potion":
						leitura = leitura();
						if (leitura[0]=="pickUp"){
							if(leitura[1]=="potion"){
								player.pickUpPocoes();
							}
						}
						leitura = leitura();
						break;
					case "key":
						leitura = leitura();
						if (leitura[0]=="pickUp"){
							if(leitura[1]=="key"){
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
		}
	}
} 

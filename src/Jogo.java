import java.util.Scanner;

public class Jogo{
	public static char ultimaLetra(String nome) {
	    if (nome != null && nome.length() > 0) {
	        return nome.charAt(nome.length() - 1);
	    }
	    return (char) 0;
	}
	/*public char readChar(){
		char c = 0; //é necessário inicializar o char
        try
        {
            c = (char) System.in.read();
        }
        return c;
	}*/
	public static void main (String[] argc){
		Player player = new Player();
		Mapa mapa = new Mapa(20);
		int a = 0;
		Scanner ler = new Scanner(System.in);
		for (;a != 1000;){
			
			player.moveToDoor(mapa.getSalas(),ultimaLetra(ler.next()));
			System.out.println(player.getSalaId());
			a = player.getSalaId();
		}
		
		
		
	}
} 

import java.util.ArrayList;
import java.util.Random;
/***************************************************************************************************************
 * Classe Troll: Classe que define objetos que movem automaticamente entre as salas, protegendo os recursos da sala
 * e retirando os recursos do jogador. Herda da classe Movimento a habilidade de se mover
 ***************************************************************************************************************/
public class Troll extends Movimento{
	//Construtor para troll, que inicializa randomicante a sala em que ele nasce
	public Troll(ArrayList<Sala> salas,String name,int qntdSalas){
		Random gerador = new Random();
		setSalaId(gerador.nextInt(qntdSalas));
		salas.get(getSalaId()).setContemTroll(salas.get(getSalaId()).getContemTroll()+1);
		setName(name);
	}
	//Atributo que indica o nome do Troll
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*Reimplementação do metodo moveToDoor da classe Movimento. Ele escolhe entre mover para umas das 3 salas adjacentes,
	 ou ficar parado. Se houver um machado ele pega (se não tiver nenhum em mãos), e se houver jogador na sala
	 ele arremessa machado*/
	public void moveToDoor(ArrayList<Sala> salas,Player player){
		int salaOrigem = getSalaId();
		Random gerador = new Random();
		int auxiliar,flag=1;
		while(flag>0){
			auxiliar = gerador.nextInt(4);
			if (auxiliar == 1){
				flag = super.moveToDoor(salas, 'a');
			}else if (auxiliar == 2){
				flag = super.moveToDoor(salas, 'b');
			}else if (auxiliar == 3){
				flag = super.moveToDoor(salas, 'c');
			}else if (auxiliar == 0){
				//Repouso
				flag = 0;
			}
		}
		salas.get(salaOrigem).setContemTroll(salas.get(salaOrigem).getContemTroll()-1);
		salas.get(getSalaId()).setContemTroll(salas.get(getSalaId()).getContemTroll()+1);
		if (salas.get(getSalaId()).getMachado()>0&&getMachado()==0){
			pickUpMachado(salas);
		}
		if (salas.get(getSalaId()).isContemPlayer()==true&&getMachado()>0){
			throwAxe(player);
		}
	}
	/*Reimplementação do metodo throwAxe da classe Movimento. Ele zera o ouro e diamante do jogador, ou remove uma 
	poção*/
	public void throwAxe (Player player){
		if(player.getPocoes()==0){
			player.setOuro(0);
			player.setDiamante(0);
			super.throwAxe();
			System.out.println("O Troll "+getName()+" te acertou e removeu todo seu ouro e diamantes");
		}else{
			System.out.println("O Troll "+getName()+" te acertou e removeu uma poção de vida");
			player.setPocoes(player.getPocoes()-1);
		}
	}
}

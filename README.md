# Trabalho Pratico 1 - Programação Orientada a Objetos
### Nome: André Lucas Nascimento Gomes
Data: 24/05/17


O jogo consiste em percorrer um Labirinto usando instruções no terminal, para encontrar uma saida. O objetivo do jogo é coletar o máximo de ouro e diamantes possivel. O programa contém 8 classes. 

### Carregador

A classe Carregador define objetos que tem a capacidade de carregar itens. Os itens são representados com atributos desta classe em inteiros. Além deles, a classe possui os getters e setters correspondentes e o atributo indicando a sala que o carregador está. Existem duas classes que extendem de Carregador: Movimento e Sala.

### Sala e Porta

Sala abstrai todos elementos existentes em uma sala no jogo. Possui um atributo para verificar quantidade de trolls na sala, um que verifica se há ou não player e as portas, e seus respectivos getters e setters. Fora isto, há outros metodos na classe:
- **geraItens:** é um metodo que gera automaticamente a quantidade de ouro, diamantes, machados e poções.
- **viewSala:** é um metodo que mostra os itens que estão na sala, e se houver Troll, a quantidade e quais trolls estão na sala.
- O contrutor da classe gera três portas, apontando para a sala correspondente de acordo com a especificação do problema.
As portas são objetos da classe Porta, que possui como atributos o ID da sala que a porta aponta e um booleano que verifica se está ou não aberta a porta. Se o ID que a porta aponta for -1, a classe aponta para nenhuma sala.

### Movimento

A classe Movimento define objetos que tem a capacidade de se movimentar entre as salas. Ela possui os seguintes metodos:
- **moveToDoor:** é um metodo que faz a movimentação entre as portas. Ela é um metodo que retorna um inteiro, que possui 5 estados: 0 - o movimento executou com sucesso, 1 - A porta está trancada, 2 - A porta não existe, 2 - a opção não existe, 4 - a porta é a saida.
- **pickUpMachado:** metodo que pega um machado da sala, se existir machado.

- **dropMachado:** solta um machado que o movimentador está segurando na sala.

- **throwAxe:** arremessa machado em outro movimentador, e o machado é consumido.

Existem duas classes que extendem esta classe: Player e Troll.

### Player

A classe define objetos que possui metodos que implementam movimentos e ações que podem ser realizadas pelo jogador. Possui um atributo fim, que verifica se há ou não saida do mapa. Possui os seguintes metodos:
- **moveToDoor:** Reimplementação do metodo de mesmo nome da classe pai dela. Ela chama a classe super, pega a flag retornada pelo metodo super e imprime no terminal o erro da instrução. Se houver movimento, ele atualiza o id indicando a sala que o jogador está, coloca como falso o atributo indicando que contem jogador na sala que ele estava, e coloca como verdadeiro o mesmo atributo, só que na sala que ele está. Se for a saida, ele seta o atributo que indica o final do jogo como **true**.
- **pickUpMachado:** Ele verifica não extrapola a quantidade maxima de itens que o jogador pode carregar, se não, chama o metodo super.
- **pickUpOuro:** Se não houver troll na sala, pega todo ouro.
- **pickUpDiamante:** Se não houver troll na sala, pega todo diamante.
- **dropOuro:** Deixa todo ouro na sala.
- **dropDiamante:** Deixa todo diamante na sala.
- **pickUpChave:** metodo para pegar a chave na sala, se houver espaço na mochila.
- **dropChave:** metodo para largar a chave na sala.
- **openPorta:** metodo para abrir a porta, se estiver trancada e se o jogador tiver chave.
- **pickUpPocoes:** metodo para pegar poções na sala, se houver espaço na mochila.
- **dropPocoes:** metodo para largar poções na sala.
- **closePorta:** metodo para fechar portas das salas, se houver poções.
- **capacidadeMochila:** Soma a quantidade de chaves, poções e machados, e se for maior que 5, retorna false, se for menor, retorna true. Se for true, quer dizer que há espaço na mochila.
- **viewPlayer:** metodo mostra no terminal o que possui na mochila do jogador.
- **throwAxe:** A função recebe o nome do troll que você deseja arremessar o machado. Se o troll estiver na sala, é consumido um machado da sua mochila (se houver) e o troll é eliminado da lista de Trolls.

### Troll

A classe define entidades que movem automaticamente entre as salas, protegendo recursos da sala e retirando-os do player. Ele possui o atributo nome e seu respectivo get e set. Além disto, a classe possui os seguintes métodos:
- **Construtor:** Seta a sala que o troll está, aleatoriamente, além de atribuir um nome a ele.
- **moveToDoor:** Reimplementa moveToDoor de Movimento. Ele escolhe entre se mover para uma das portas adjacentes ou ficar parado. A função só termina se houver sala para a respectiva porta, ou ir para opção parado.
- **throwAxe:** Reimplementa throwAxe de Movimento. Se o player na sala não houver poções, zera o ouro e os diamantes do jogador e retira um machado do troll. Retorna no terminal o resultado para que o jogador veja.

### Mapa

A classe define o mapa inicial do jogo e a disposição de Trolls. A classe contém duas ArrayLists de atributos: uma guardando a quantidade de salas e outra guardando a quantidade de trolls. O construtor da classe instância as salas e trolls e seta atributos especicados previamente das salas.


### Jogo

A classe contém a função principal, além de metodos que direcionam o jogo de acordo com a instrução do jogador. Os metodos presentes na classe são:
- **retiraLetra:** Transforma a primeira letra da string em char.
- **leitura:** Função que executa a leitura das instruções no terminal.
- **moveToDoor:** Trata todas instruções que começam por *moveToDoor*, indo para os respectivos metodos ou aguardando instruções que funcionam em sequencia a moveToDoor.
- **moveTo:** Trata todas instruções que começam com *moveTo*, indo para os respectivos metodos ou aguardando instruções que funcionam em sequencia.
- **dropItem:** Trata as instruções iniciadas por *drop*, indo para os respectivos metodos.
- **openDoor:** Trata a instrução *openDoor*.
- **closeDoor:** Trata a instrução *closeDoor*.
- **main:** A main instância Mapa e Player, lê a primeira instrução, e realiza um laço que vai para o metodo que trata a instrução e realiza uma nova leitura. O loop finaliza se o jogador chegar ao final do jogo. Após isto, o programa imprime o que está na mochila do jogador e finaliza.

- 

%%%Falta classes: JOGO
%%%Falta explicar: Funcionamento do jogo

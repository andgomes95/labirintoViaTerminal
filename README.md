Trabalho Pratico 1 - Programação Orientada a Objetos
Data: 24/05/17
Nome: André Lucas Nascimento Gomes

O jogo consiste em percorrer um Labirinto usando instruções no terminal, para encontrar uma saida. O objetivo do jogo é coletar o máximo de ouro e diamantes possivel. O programa contém 8 classes. 

A classe Carregador define objetos que tem a capacidade de carregar itens. Os itens são representados com atributos desta classe em inteiros. Além deles, a classe possui os getters e setters correspondentes. 

Existem duas classes que extendem de Carregador: Movimento e Sala. Sala abstrai todos elementos existentes em uma sala no jogo. Possui um atributo para verificar quantidade de trolls na sala, um que verifica se há ou não player e as portas, e seus respectivos getters e setters. Fora isto, há outros metodos na classe:
- geraItens: é um metodo que gera automaticamente a quantidade de ouro, diamantes, machados e poções.
- viewSala: é um metodo que mostra os itens que estão na sala, e se houver Troll, a quantidade e quais trolls estão na sala.
- O contrutor da classe gera três portas, apontando para a sala correspondente de acordo com a especificação do problema.
As portas são objetos da classe Porta, que possui como atributos o ID da sala que a porta aponta e um booleano que verifica se está ou não aberta a porta. Se o ID que a porta aponta for -1, a classe aponta para nenhuma sala.

A classe Movimento define objetos que tem a capacidade de se movimentar entre as salas. Ela possui os seguintes metodos:
- 

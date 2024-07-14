# Torres de Hanói

Este projeto implementa a solução para o famoso problema das Torres de Hanói. É um problema matemático e de quebra-cabeça que envolve três hastes e um número de discos de tamanhos diferentes, que podem deslizar em qualquer haste. O quebra-cabeça começa com os discos empilhados em ordem decrescente de tamanho em uma haste, a menor no topo, formando uma forma cônica.

## Objetivo

O objetivo do problema das Torres de Hanói é mover toda a pilha de discos de uma haste (a origem) para outra haste (o destino), usando uma terceira haste (auxiliar) como uma ajuda temporária. As regras do quebra-cabeça são as seguintes:

1. Apenas um disco pode ser movido de cada vez.
2. Cada movimento consiste em pegar o disco superior de uma das pilhas e movê-lo para outra haste.
3. Nenhum disco pode ser colocado sobre um disco menor.

## Estrutura do Projeto

O projeto consiste em três classes principais:

1. **TorreSolucao**: Implementa a lógica de solução das Torres de Hanói, movendo os discos entre as hastes.
2. **TorresDeHanoi**: Classe principal que inicia o processo, obtendo a entrada do usuário e executando a solução.
3. **Torre**: Representa as torres e os discos, com métodos para mover os discos e imprimir o estado atual das torres.

## Como Executar

### Pré-requisitos

- Java JDK instalado (versão 8 ou superior).

### Passos para Executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/torres-de-hanoi.git
cd torres-de-hanoi
Compile as classes Java:


javac hanoi/Torre.java hanoi/TorreSolucao.java hanoi/TorresDeHanoi.java
Execute o programa:


java hanoi.TorresDeHanoi
Digite o número de discos quando solicitado e veja o processo de solução impresso no console.
Exemplo


Entrada de valor para o contador: 3
|     ===     |
|   =====   |
|========|
Neste exemplo, o programa imprime o estado inicial das torres e, em seguida, mostra cada passo da solução.

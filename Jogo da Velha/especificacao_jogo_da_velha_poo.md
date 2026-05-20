# Especificação do Projeto – Jogo da Velha em Java com Programação Orientada a Objetos

## 1. Apresentação

O sistema deverá permitir que dois jogadores participem de uma partida de jogo da velha, alternando jogadas até que haja vitória de um jogador ou empate.

---

# 2. Problema a ser resolvido

Desenvolver um sistema capaz de executar uma partida de jogo da velha entre dois jogadores humanos, com interação por terminal. O sistema deve permitir registrar os nomes dos jogadores, alternar turnos, validar jogadas, atualizar o tabuleiro e encerrar a partida quando houver vitória ou empate.

---

# 4. Requisitos funcionais

## RF01 – Cadastro dos jogadores
O sistema deve permitir informar o nome de dois jogadores.

## RF02 – Associação de símbolos
O sistema deve associar automaticamente os símbolos:
- `X` ao jogador 1
- `O` ao jogador 2

## RF03 – Exibição do tabuleiro
O sistema deve exibir o tabuleiro do jogo da velha durante a partida.

## RF04 – Registro de jogadas
O sistema deve permitir que o jogador da vez informe:
- linha
- coluna

para realizar sua jogada.

## RF05 – Validação de posição
O sistema deve impedir jogadas em posições:
- fora do intervalo válido do tabuleiro;
- já ocupadas.

## RF06 – Alternância de turno
O sistema deve alternar corretamente entre os dois jogadores após cada jogada válida.

## RF07 – Verificação de vitória
O sistema deve verificar se houve vitória após cada jogada.

## RF08 – Verificação de empate
O sistema deve verificar se houve empate quando o tabuleiro estiver completamente preenchido sem vencedor.

## RF09 – Encerramento da partida
O sistema deve encerrar a partida quando:
- um jogador vencer;
- ocorrer empate.

## RF10 – Exibição do resultado
Ao final da partida, o sistema deve informar se:
- houve vitória de um jogador;
- houve empate.

---

# 5. Requisitos técnicos

## RT01 – Organização em camadas
O sistema deve ser organizado em três camadas:

- `model`
- `controller`
- `view`

---

# 6. Organização em camadas

## 6.1 Camada Model
Essa camada representa os dados e estruturas do domínio do problema.

### Classes sugeridas
- `Jogador`
- `Tabuleiro`
- `Simbolo`
- `StatusPartida`

### Responsabilidades
- representar os jogadores;
- representar o tabuleiro;
- armazenar o estado da partida;
- disponibilizar operações ligadas aos dados do jogo.

---

## 6.2 Camada Controller
Essa camada será responsável por controlar o fluxo da partida.

### Classe sugerida
- `JogoDaVelhaController`

### Responsabilidades
- controlar o turno atual;
- solicitar ao tabuleiro o registro de jogadas;
- verificar vitória;
- verificar empate;
- alternar jogadores;
- controlar o status da partida.

---

## 6.3 Camada View
Essa camada será responsável pela interação com o usuário.

### Classes sugeridas
- `JogoDaVelhaView`
- `Main`

### Responsabilidades
- solicitar os nomes dos jogadores;
- exibir o tabuleiro;
- solicitar jogadas;
- mostrar mensagens de erro;
- mostrar resultado final.

---

# 7. Modelagem sugerida

## 7.1 Enum `Simbolo`
Representa os símbolos possíveis no tabuleiro.

### Sugestão
- `X`
- `O`

---

## 7.2 Enum `StatusPartida`
Representa o estado atual da partida.

### Sugestão
- `EM_ANDAMENTO`
- `VITORIA`
- `EMPATE`

---

## 7.3 Classe `Jogador`

### Atributos sugeridos
- `nome`
- `simbolo`

### Responsabilidade
Representar um jogador da partida.

---

## 7.4 Classe `Tabuleiro`

### Estrutura sugerida
Uma matriz 3x3 de símbolos.

### Responsabilidades sugeridas
- registrar jogada;
- verificar se uma posição está livre;
- verificar vitória;
- verificar empate;
- exibir o estado atual do tabuleiro.

---

## 7.5 Classe `JogoDaVelhaController`

### Atributos sugeridos
- `tabuleiro`
- `jogador1`
- `jogador2`
- `jogadorAtual`
- `status`

### Responsabilidades sugeridas
- iniciar a lógica da partida;
- processar jogadas;
- alternar turno;
- verificar encerramento.

---

# 8. Exceção personalizada

## Classe sugerida
- `JogadaInvalidaException`

### Situações em que pode ser usada
- linha inválida;
- coluna inválida;
- posição já ocupada.

Essa exceção deve ser lançada pela camada apropriada e tratada na camada de visão, para que o sistema continue funcionando sem encerrar abruptamente.

---

# 9. Estrutura sugerida de pacotes

```text
src/
 ├── model/
 │    ├── Jogador.java
 │    ├── Tabuleiro.java
 │    ├── Simbolo.java
 │    └── StatusPartida.java
 │
 ├── controller/
 │    └── JogoDaVelhaController.java
 │
 ├── exception/
 │    └── JogadaInvalidaException.java
 │
 ├── view/
 │    ├── JogoDaVelhaView.java
 │    └── Main.java
```

---

# 10. Regras mínimas de funcionamento

O sistema deve seguir, no mínimo, as seguintes regras:

1. o tabuleiro possui 3 linhas e 3 colunas;
2. uma posição só pode receber um símbolo uma única vez;
3. o jogador da vez informa linha e coluna;
4. o sistema deve validar a jogada antes de registrá-la;
5. após uma jogada válida, o sistema verifica vitória;
6. se não houver vitória, o sistema verifica empate;
7. se não houver empate, o turno passa ao outro jogador.

---

# 11. Fluxo mínimo esperado da aplicação

1. solicitar nome do jogador 1;
2. solicitar nome do jogador 2;
3. iniciar partida;
4. exibir tabuleiro;
5. solicitar jogada do jogador atual;
6. validar jogada;
7. registrar jogada;
8. verificar vitória ou empate;
9. repetir até o fim da partida;
10. exibir resultado final.

---

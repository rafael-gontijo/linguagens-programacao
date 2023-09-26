```markdown
# Lotofácil em Java

Este é um simples programa em Java que simula um jogo da Lotofácil no terminal.
O programa permite aos jogadores fazer apostas de três tipos diferentes e verifica se eles ganharam prêmios com base nas regras de negocio.

## Requisitos

- JDK (Java Development Kit): versão 17
- Git: version 2.40.0.windows.1
- Bibliotecas padrão do Java: Scanner e Random.

```
## Como Executar

1. Clone o repositório:

   ```shell
   git clone https://github.com/rafael-gontijo/linguagens-programacao/
   ```

2. Acesse o diretório do projeto:

   ```shell
   cd .\linguagens-programacao\LotoFacil\src\application\
   ```

3. Utilize o Java para executar o arquivo:
   ## Via console
   ```shell
   java .\LotoFacil.java
   ```
   ou
   ## Via GUI
      ```shell
   java .\LotoFacilGUI.java
   ```
   

## Menu LOTOFÁCIL

O programa apresenta um menu com as seguintes opções:

1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair

## Regras do Jogo

- **Apostar de 0 a 100**: O jogador insere um número entre 0 e 100. Se o número escolhido for igual ao número sorteado, o jogador ganha R$ 1.000,00 reais.

- **Apostar de A à Z**: O jogador insere uma letra de A à Z (maiúscula ou minúscula). Se a letra escolhida for igual à letra premiada (definida no código), o jogador ganha R$ 500,00 reais.

- **Apostar em par ou ímpar**: O jogador insere um número inteiro, e o programa verifica se é par ou ímpar. Se for par, o jogador ganha R$ 100,00 reais. Se for ímpar, o jogador não ganha prêmio.

## Exemplo de Uso

1. Escolha uma opção do menu.
2. Siga as instruções para fazer sua aposta.
3. O programa informará se você ganhou um prêmio ou não.
4. Repita o processo para fazer mais apostas ou saia do programa.

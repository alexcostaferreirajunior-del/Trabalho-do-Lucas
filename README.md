# Game Store

## Nome do projeto
Game Store

## Integrantes
- Alex Costa Ferreira Junior-del
- Iago Magalhaes Silva

## Descrição do problema
O projeto consiste em um sistema de loja de jogos em Java, inspirado em plataformas como Steam. O programa permite que o usuário cadastre sua conta, visualize e cadastre jogos, realize compras utilizando um saldo inicial e acompanhe a biblioteca de jogos adquiridos.

A aplicação foi desenvolvida para exercitar conceitos de programação orientada a objetos, como classes, encapsulamento, coleções e interação com entrada de dados via console.

## Funcionalidades
- Cadastro de usuário com nome, e-mail, senha e biblioteca inicial
- Cadastro de jogos com nome, valor, gênero e avaliação
- Exibição do catálogo de jogos
- Compra de jogos com validação de saldo
- Verificação se o usuário já possui o jogo
- Visualização da biblioteca do usuário
- Menu interativo no terminal

## Estrutura do projeto
- `Trabalho1/src/trabalho1/App.java` — classe principal com o menu e fluxo do sistema
- `Trabalho1/src/trabalho1/Usuario.java` — gerenciamento de dados do usuário e biblioteca
- `Trabalho1/src/trabalho1/Jogos.java` — controle do catálogo de jogos
- `Trabalho1/src/trabalho1/Compra.java` — lógica de compra e validações

## Instruções para executar
### Opção 1: via terminal
```bash
cd Trabalho-do-Lucas
javac -d Trabalho1/out Trabalho1/src/trabalho1/*.java
java -cp Trabalho1/out trabalho1.App
```

### Opção 2: via NetBeans/IDE
1. Abra a pasta `Trabalho1` no NetBeans ou em outra IDE Java.
2. Compile o projeto.
3. Execute a classe `trabalho1.App`.

## Exemplo de utilização
```text
=========================================
        STEAM / GAME STORE - REGISTO
=========================================
Registe-se para criar a sua conta e entrar no site!

Nome de Utilizador: Alice
E-mail: alice@email.com
Palavra-passe (Senha): 123456
Insira o primeiro jogo para a sua biblioteca: Elden Ring

[SUCESSO] Conta criada com sucesso para alice@email.com!
Bem-vindo(a) à Game Store, Alice!

Digite o saldo inicial do usuario: 250.00

Digite 1 para adicionar jogo, 2 para ver o catalogo, 3 para fazer uma compra, 4 para ver sua biblioteca ou 0 para sair: 2

Digite 1 para adicionar jogo, 2 para ver o catalogo, 3 para fazer uma compra, 4 para ver sua biblioteca ou 0 para sair: 3
Escolha o index do jogo para comprar: 0
Compra realizada com sucesso!
Saldo restante: R$ 200.00
```

## Divisão das responsabilidades da equipe
- Alex Costa Ferreira Junior-del
  - Implementação do menu principal
  - Fluxo de interação com o usuário
  - Lógica de compra e controle de saldo
  - Organização geral do projeto

- Iago Magalhaes Silva
  - Modelagem e estrutura da classe `Usuario`
  - Desenvolvimento do catálogo de jogos
  - Biblioteca de jogos do usuário
  - Integração das regras de cadastro e exibição

## Observações
Este projeto foi desenvolvido como atividade acadêmica para aplicar conceitos de Java e POO em um cenário prático de loja de jogos. O sistema é executado no terminal e serve como uma simulação simples de uma plataforma de compra e gerenciamento de jogos.

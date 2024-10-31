

# Banco

Este projeto é um simples sistema bancário em Java. Ele permite que o usuário visualize seu saldo, faça depósitos e transferências, além de sair da aplicação a qualquer momento. O programa é executado no terminal e utiliza `Scanner` para ler entradas do usuário.

## Funcionalidades

- Exibir informações básicas do usuário
- Consultar saldo atual
- Fazer depósitos
- Realizar transferências
- Sair do programa

## Pré-requisitos

Para executar o programa, você precisa ter o Java instalado em sua máquina. [Clique aqui](https://www.oracle.com/java/technologies/javase-downloads.html) para baixar a versão mais recente do Java Development Kit (JDK).

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd nome-do-repositorio
    ```
3. Compile o código Java:
    ```bash
    javac Banco.java
    ```
4. Execute o programa:
    ```bash
    java Banco
    ```

## Exemplo de Uso

Ao iniciar o programa, você será solicitado a inserir seu nome, saldo inicial e o tipo de conta. O programa então exibe suas informações e apresenta as seguintes opções:

- **1 - Ver saldo**: Mostra o saldo atual.
- **2 - Depositar**: Permite que o usuário deposite um valor na conta.
- **3 - Transferir**: Permite que o usuário transfira um valor, subtraindo-o do saldo.
- **4 - Sair**: Encerra o programa.

## Exemplo de Saída

```plaintext
Digite seu nome
> João

Digite seu valor no banco
> 1500.00

Digite seu tipo de conta
> Corrente

********************
Seu nome é: João
Seu saldo é: 1500.00
Sua conta é: Corrente
********************

Selecione uma opção para prosseguir:

1 - Ver saldo
2 - Depositar
3 - Transferir
4 - Sair
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma [issue](https://github.com/seu-usuario/nome-do-repositorio/issues) ou enviar um [pull request](https://github.com/seu-usuario/nome-do-repositorio/pulls) com melhorias ou correções.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

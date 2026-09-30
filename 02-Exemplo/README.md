# Implementando o Componente Director

Vamos evoluir o código anterior. 

Introduziremos a classe `Director` para padronizar a criação de perfis (`Administrador` e `Convidado`).

O `Director` é responsável por definir quais passos executar e em qual ordem para criar configurações específicas de um objeto. 

O cliente apenas chama o `Director` e passa o `Builder` para ele.



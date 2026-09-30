# Implementando o Componente Director

Vamos evoluir o código anterior. 

Introduziremos a classe `Director` para padronizar a criação de perfis (`Administrador` e `Convidado`).

O `Director` é responsável por definir quais passos executar e em qual ordem para criar configurações específicas de um objeto. 

O cliente apenas chama o `Director` e passa o `Builder` para ele.


```bash
javac *.java
```

```bash
java Main
```

```text
Saída:

--- Perfil Administrador ---
Usuario{id=999, nome='Admin', sobrenome='Sistema', email='admin@empresa.com', idade=2000-01-01, genero='Não Informado'}

--- Perfil Convidado ---
Usuario{id=100, nome='Convidado', sobrenome='Visitante', email='null', idade=null, genero='null'}
```
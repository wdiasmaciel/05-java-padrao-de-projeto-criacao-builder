# Adicionando Validações Personalizadas no build()

Uma das maiores vantagens do Builder é garantir a consistência do objeto antes de ele ser instanciado. 

Se as regras falharem, lançamos uma exceção (geralmente IllegalStateException ou IllegalArgumentException).

Modificaremos o método `build()` dentro da classe estática `Builder` para validar três regras:

1. O nome e o sobrenome são obrigatórios.

2. O e-mail deve conter um caractere @ (validação simples).

3. O usuário deve ser maior de 18 anos (baseado na data atual).

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
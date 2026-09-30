# Adicionando Validações Personalizadas no build()

Uma das maiores vantagens do Builder é garantir a consistência do objeto antes de ele ser instanciado. 

Se as regras falharem, lançamos uma exceção (geralmente IllegalStateException ou IllegalArgumentException).

Modificaremos o método `build()` dentro da classe estática `Builder` para validar três regras:

1. O nome e o sobrenome são obrigatórios.

2. O e-mail deve conter um caractere @ (validação simples).

3. O usuário deve ser maior de 18 anos (baseado na data atual).


Se você rodar esse segundo teste, o console exibirá as mensagens de erro controladas, impedindo que objetos corrompidos ou inválidos circulem pela sua aplicação.


```bash
javac *.java
```

```bash
java Main
```

```text
Saída:

Tentando criar usuário com 15 anos...
Erro de Validação: O usuário deve ser maior de 18 anos. Idade atual: 15

-------------------------------------

Tentando criar usuário sem sobrenome...
Erro de Validação: O sobrenome é obrigatório.
```
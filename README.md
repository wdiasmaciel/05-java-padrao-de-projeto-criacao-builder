# 05-java-padrao-de-projeto-criacao-builder

# Definição

O Builder é um padrão de projeto criacional que permite a construção de objetos complexos passo a passo. 

Ele separa a lógica de construção de um objeto da sua representação final, possibilitando que o mesmo processo de construção possa criar diferentes tipos e representações do objeto.

# Principais Características, Indicações e Observações

## Características

• `Interface Fluente`: permite o encadeamento de métodos (ex: .nome().sobrenome().build()), tornando o código legível e autoexplicativo.

• `Imutabilidade`: facilita a criação de objetos imutáveis, já que os atributos da classe principal podem ser definidos como final e modificados apenas durante a construção.

• `Isolamento de Código`: a lógica complexa de inicialização fica restrita à classe interna `Builder`, limpando a classe de negócio.

## Indicações (Quando usar)

• `Construtores "Telescópicos"`: quando uma classe possui um construtor com muitos parâmetros (especialmente se vários forem opcionais), gerando sobrecargas confusas.

• `Criação Passo a Passo`: Quando o objeto precisa estar totalmente disponível apenas após passar por várias etapas de configuração.

• `Representações Diferentes`: quando o mesmo processo de montagem precisa produzir variações do mesmo objeto.

## Observações

• O padrão pode opcionalmente incluir uma classe `Director`. O `Director` define apenas a ordem dos passos de construção, enquanto o `Builder` executa esses passos.

• Em ecossistemas Java modernos, o uso manual do `Builder` é frequentemente substituído por ferramentas de geração de código, como a anotação `@Builder` do `Lombok`.

# Quando Ele DEVE Ser Usado?

• Quando o seu objeto possui mais de 4 ou 5 parâmetros no construtor.

• Quando muitos desses atributos são opcionais ou possuem valores padrão.

• Quando você deseja garantir que o objeto seja imutável após a sua criação (sem métodos `setters` públicos).

• Quando a criação do objeto exige validações cruzadas entre os parâmetros antes que ele seja instanciado.

# Quando Ele NÃO Deve Ser Usado?

• Objetos simples: se a classe possui poucos atributos (ex: 2 ou 3) e quase todos são obrigatórios, o `Builder` adiciona complexidade desnecessária.

• Objetos mutáveis por natureza: se o estado do objeto precisa ser alterado constantemente via métodos `setter` ao longo da execução do sistema.

• Domínios orientados a dados puros (`DTOs` simples): em que estruturas de registros (como os `record` do Java) resolvem o problema de forma nativa e mais enxuta.

# Vantagens e Desvantagens

## Vantagens	

• Legibilidade: elimina a confusão de passar múltiplos parâmetros na ordem errada no construtor.

• Segurança (Thread-Safety): ao apoiar a imutabilidade, evita problemas de concorrência com o objeto construído.

• Controle de Construção: permite adiar a criação do objeto ou construí-lo de forma recursiva/parcial.

## Desvantagens
• Proliferação de Código: exige a criação de uma classe interna duplicando quase todos os atributos da classe original.

• Complexidade Inicial: introduz mais linhas de código e mais classes ao projeto logo no início do desenvolvimento.

• Manutenção Duplicada: se um novo atributo for adicionado à classe, ele também precisará ser adicionado ao Builder.

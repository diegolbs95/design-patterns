# Padrão Adapter em Java

## Descrição do Problema

Imagine que você tem um sistema que precisa reproduzir arquivos de áudio usando um reprodutor de mídia antigo que suporta apenas um formato específico de arquivo de áudio. No entanto, você está trabalhando com uma nova interface de reprodutor de mídia que espera ser capaz de reproduzir arquivos de áudio em vários formatos. O problema é como fazer com que o reprodutor de mídia antigo seja compatível com a nova interface sem modificar seu código existente.

## Solução Proposta

A solução proposta para este problema é utilizar o padrão de projeto Adapter. O Adapter permite que interfaces incompatíveis trabalhem juntas. Neste caso, vamos criar um adaptador que irá permitir que o reprodutor de mídia antigo seja utilizado onde um novo reprodutor de mídia é esperado.

## Implementação em Java

O código-fonte neste repositório contém a implementação do padrão Adapter em Java. Aqui está uma breve visão geral dos principais componentes:

- `NovoReprodutorMidia`: Interface que define a nova interface para reproduzir arquivos de áudio.
- `VelhoReprodutorMidia`: Interface que define a interface do reprodutor de mídia antigo.
- `VelhoReprodutorMidiaImpl`: Classe que representa o reprodutor de mídia antigo que reproduz arquivos de áudio em um formato específico.
- `NovoReprodutorAdapter`: Classe que atua como adaptador entre a interface `NovoReprodutorMidia` e a interface `VelhoReprodutorMidia`, permitindo que o reprodutor de mídia antigo seja utilizado onde um novo reprodutor de mídia é esperado.

## Exemplo de Uso

Um exemplo de uso do padrão Adapter em Java está disponível no arquivo `Main.java` neste repositório. Você pode executá-lo para ver como a adaptação entre as interfaces funciona na prática.

## Contribuições

Contribuições são bem-vindas! Se você tiver sugestões de melhorias ou encontrar problemas no código.
# Insertion Sort em Java

## Sobre

Este projeto apresenta a implementação do **algoritmo de ordenação por inserção (Insertion Sort)** em Java. O algoritmo organiza uma lista de números inteiros em **ordem crescente**.

## Como o algoritmo funciona

O Insertion Sort funciona da seguinte maneira:

1. Começa com uma lista vazia (`newNumbers`) que será a lista ordenada.
2. Percorre cada elemento da lista original (`numbers`) um por um.
3. Para cada elemento:
   - Compara com os elementos da lista ordenada.
   - Encontra a posição correta onde ele deve ser inserido.
   - Insere o elemento nessa posição, mantendo a lista ordenada.
4. Repete até que todos os elementos da lista original tenham sido inseridos na lista ordenada.

O resultado é uma lista ordenada em **ordem crescente**.

## Exemplo de execução

**Entrada:**  
34, 7, 23, 32, 5, 62, 14, 1, 9, 45

makefile
Copiar código

**Saída:**  
Lista original: [34, 7, 23, 32, 5, 62, 14, 1, 9, 45]  
Lista ordenada: [1, 5, 7, 9, 14, 23, 32, 34, 45, 62]

markdown
Copiar código

## Complexidade

- **Melhor caso:** O(n) — quando a lista já está ordenada.
- **Pior caso:** O(n²) — quando a lista está inversamente ordenada.
- **Espaço adicional:** O(n) nesta implementação (devido ao `newNumbers`), mas pode ser feito **in-place** sem espaço extra.

## Conclusão

O Insertion Sort é simples e eficiente para listas pequenas ou quase ordenadas, sendo útil para aprendiz

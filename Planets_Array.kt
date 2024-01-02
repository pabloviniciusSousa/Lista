
  

/*

Matriz é a maneira mais simples de agrupar uma quantidade arbitrária de valores nos seus programas
Matriz é uma sequência de valores de um mesmo tipo.

 - Uma matriz contém diversos valores chamados de elementos ou, às vezes, itens.
 - Os elementos de uma matriz são ordenados e acessados com um índice.

O indice é um número inteiro que corresponde a um elemento de uma matriz,o primeiro elemento

*/



fun main(){
    
    val rockPlanets = arrayOf<String>("Mercurio", "Venus", "Terra", "Marte")
    val gasPlanets = arrayOf("Jupiter", "Saturno", "Urano", "Netuno")
    val solarSystem = rockPlanets + gasPlanets

    println(solarSystem[2])



}
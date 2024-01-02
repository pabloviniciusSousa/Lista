/*

Uma lista é uma coleção redimensionavel ordenada, geralmente implementada em uma matriz redimensionavel
Com a lista pode adicionar novos elementos

 - A List é uma interface que define propriedades e métodos relacionados a uma coleção ordenada de itens somente leitura.
 - A MutableList amplia a interface List definindo métodos para modificar uma lista, como a adição e remoção de elementos.

 Para modificar as listas é preciso utilizar o MutableList

 - A primeira função add() tem um único parâmetro do tipo de elemento na lista e adiciona o elemento ao final da lista.
 - A outra versão de add() tem dois parâmetros. O primeiro corresponde ao índice em que o novo elemento precisa ser inserido. O segundo é o elemento que está sendo adicionado à lista.
*/

val solarSystem = listOf("Mercurio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno")
val solarSystem2 = mutableListOf("Mercurio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno")

fun main(){

    //Para extrair o número de elementos de uma lista
    println(solarSystem.size)
    //Mostrar o Planeta no indice 2
    println(solarSystem[2])
    //Mostrar elemento no indice 3 chamando o get
    println(solarSystem.get(3))
    //Mostrar o indice do elemento, é so usar o indexOf(), se não tiver o elemento é retornado -1
    println(solarSystem.indexOf("Terra"))
    println(solarSystem.indexOf("Plutão"))
    //realizar uma interação de elementos com for
    for (planeta in solarSystem){
        println(planeta)
    }

    //Adicionar elemento a lista
    solarSystem2.add("Pluto")
    //Adicionar elemento a lista em um indice especifico
    solarSystem2.add(3, "Theia")
    //realizar uma interação de elementos com for
    for (planeta2 in solarSystem2){
        println(planeta2)
    }
    //Atualizar elemento
    solarSystem2[3] = "Futura Lua"
    //realizar uma interação de elementos com for
    for (planeta2 in solarSystem2){
        println(planeta2)
    }
    //Para remover itempode utilizar o remove ou removeAt
    solarSystem2.removeAt(9)
    solarSystem2.remove("Futura Lua")
    //realizar uma interação de elementos com for
    for (planeta2 in solarSystem2){
        println(planeta2)
    }
    //Para identificar se tem o elemento na lista pode utilizrar o contains
    println(solarSystem2.contains("Terra"))
    //Para ser mais conciso pode utilizar o in
    println("Terra" in solarSystem2)


}
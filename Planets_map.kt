/*
Map é uma coleção de chaves e valores, as chaves são exclusivas. 
Essa relação é chamada de key-value pair(para de chvel-valor).
As chaves são exclusivas, mas, os valores não, podem haver o mesmo valor com duas chaves distintas
Podem ser declarados com mapOf() ou MutableMapOf()

*/

val solarSystem = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 1,
    "Terra" to 2,
    "Marte" to 3,
    "Jupiter" to 79,
    "Saturno" to 82,
    "Uranos" to 27,
    "Netuno" to 14
)

fun main(){

    //Tem a propriedade size
    println(solarSystem.size)
    //Definindo mais pares chavel valores
    solarSystem["Pluto"] = 5
    //Tem a propriedade size
    println(solarSystem.size)
    //Pode utilizar a chave para ver o valor
    println(solarSystem["Pluto"])
    //Pode utilizar o get também,se não tiver é retornado um valor null
    println(solarSystem.get("Theia"))
    //Para remover é utilizar o remove
    solarSystem.remove("Pluto")
    //Tem a propriedade size
    println(solarSystem.size)
    //O metodo put pode modificar
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}
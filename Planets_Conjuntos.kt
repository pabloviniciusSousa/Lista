/*
Um conjunto de coleção não tem ordem especifica e não tem valores duplicados

Utilizando a funçao hashCode(), gera um código int que garante uma certa exclusividade.

Os conjuntos têm duas propriedades importantes:

- Em comparação com listas, pesquisar um elemento específico em um conjunto é rápido, especialmente para coleções grandes. O método indexOf() em uma List exige a verificação de cada elemento desde o início até uma correspondência ser encontrada. Já para conjuntos, em média, a mesma quantidade de tempo é necessária para verificar se um elemento está na coleção, seja ele o primeiro ou o milionésimo.
- Conjuntos costumam usar mais memória do que listas para a mesma quantidade de dados, já que mais índices de matriz costumam ser necessários do que os dados do conjunto

Os conjuntos são bons para conjuntos muito grandes de dados, pois, não permite duplicidade entre eles.

É utilizado o Set e o MutableSet
*/

val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

fun main(){

    //O MutableSetOF também tem o add() para adicionar dados
    solarSystem.add("Pluto")
    //Mostrar o tamanho com size
    println(solarSystem.size)
    //contains idenfica se tem esse dados retornando um true
    println(solarSystem.contains("Pluto"))
    //Agora vou adicionar o Pluto novamente para vermos o que vai acontecer
    solarSystem.add("Pluto")
    //Remove para remover os dados
    solarSystem.remove("Pluto")
    
    println(solarSystem.contains("Pluto"))
}
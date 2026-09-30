package com.alanturing.campeonesdeleagueoflegends.Data

class ChampionRepository {
    private val _champion = listOf(
        Champion(1,"Annie"),
        Champion(2,"Fizz"),
    )
    fun readAll():List<Champion> = _champion
}
data class Champion(
    val id: Int,
    val name: String,
)
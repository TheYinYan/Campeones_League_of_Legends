package com.alanturing.campeonesdeleagueoflegends.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alanturing.campeonesdeleagueoflegends.Data.Champion
import com.alanturing.campeonesdeleagueoflegends.Data.ChampionRepository

@Composable
fun ChampionListScreem(modifier: Modifier = Modifier) {
    val champions = ChampionRepository()
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
    ) {
        items(
            items = champions.readAll(),
            key = { champion: Champion -> champion.id }
        ) { champion ->
            ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(champion: Champion) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = champion.idImage),
            contentDescription = champion.name,
        )
        Text(
            text = champion.name,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}
package com.alanturing.campeonesdeleagueoflegends.ui

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
    LazyColumn(modifier.fillMaxWidth()
        .padding(all = 8.dp)) {
        items(
            items = champions.readAll(),
            key = { champion: Champion ->
                champion.id
            },
        ){
            champion ->
            ChampionItem(champion)
        }
    }
}

@Composable
    }
}
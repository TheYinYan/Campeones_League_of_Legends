package com.alanturing.campeonesdeleagueoflegends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alanturing.campeonesdeleagueoflegends.ui.ChampionListScreem
import com.alanturing.campeonesdeleagueoflegends.ui.theme.CampeonesDeLeagueOfLegendsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampeonesDeLeagueOfLegendsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   val modifier = Modifier
                       .consumeWindowInsets(innerPadding)
                       .padding(innerPadding)

                    ChampionListScreem(modifier = modifier)
                }
            }
        }
    }
}
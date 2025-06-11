package com.pjsoft.cryptoapp.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjsoft.cryptoapp.presentation.ui.theme.CryptoAppTheme

@Composable
fun StatsScreen(innerPadding : PaddingValues){
    val green = Color(0xFF4CAF50)
    val red = Color(0xFFF44336)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp)

    ) {
        Text(
            text = "Estadisticas",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(size = 16.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(20.dp),
            contentAlignment = Alignment.CenterStart

        ) {
            Column(
                modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            ) {
                Text(
                    text = "Total BTC",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "0.54000",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

        }
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(size = 16.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(20.dp),
            contentAlignment = Alignment.CenterStart

        ) {
            Column(
                modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            ) {
                Text(
                    text = "Costo promedio",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "$24,320.54",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

        }
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
                .clip(RoundedCornerShape(size = 16.dp))
                .padding(20.dp),
            contentAlignment = Alignment.CenterStart

        ) {
            Column(
                modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            ) {
                Text(
                    text = "Total Comprado",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "0.54000",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

        }
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(size = 16.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(20.dp),
            contentAlignment = Alignment.CenterStart

        ) {
            Column(
                modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            ) {
                Text(
                    text = "Total Vendido",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "0.54000",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

        }
        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(size = 16.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(20.dp),
            contentAlignment = Alignment.CenterStart

        ) {
            Column(
                modifier = Modifier.background(MaterialTheme.colorScheme.surface)
            ) {
                Text(
                    text = "Ganancia / Perdida no realizada",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "$1,643.45 USD",
                    style = MaterialTheme.typography.titleMedium,
                    color = green
                )
            }

        }
    }
}

@Preview
@Composable
fun StatsScreenPreview(){
    CryptoAppTheme {
        StatsScreen(innerPadding = PaddingValues(10.dp))
    }
}
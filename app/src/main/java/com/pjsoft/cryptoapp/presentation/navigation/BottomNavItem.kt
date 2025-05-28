package com.pjsoft.cryptoapp.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.pjsoft.cryptoapp.presentation.components.Chart

sealed class BottomNavItem(val title : String, val icon : ImageVector){
    object Home : BottomNavItem(title = "Inicio", icon = Icons.Default.Home)
    object Stats : BottomNavItem(title = "Estadisticas", icon = Chart)
}

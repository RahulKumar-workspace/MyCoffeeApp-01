package com.example.mycoffeeapp_01.Screens.UiComponents

import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp_01.R
import androidx.compose.ui.res.painterResource
import com.example.mycoffeeapp_01.ui.theme.LightBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomNavBar() {
    // BottomNavItems
    val navItems = listOf(
        NavItems(title = "Home", R.drawable.regular_outline_home),
        NavItems(title = "Cart", R.drawable.regular_outline_bag),
        NavItems(title = "Favorite", R.drawable.regular_outline_heart),
        NavItems(title = "Profile", R.drawable.outline_account_circle_24)
    )

    NavigationBar(
        contentColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp),
    ) {
        navItems.forEachIndexed { index, items ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = items.icon),
                        contentDescription = items.title
                    )
                },
                label = { Text(items.title) },
                modifier = Modifier.size(30.dp),
                onClick = { },
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.02f)
                )
            )
        }
    }
}


data class NavItems(
    val title: String,
    val icon: Int
)
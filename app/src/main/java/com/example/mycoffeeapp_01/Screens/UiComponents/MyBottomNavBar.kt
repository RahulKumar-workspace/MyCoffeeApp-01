package com.example.mycoffeeapp_01.Screens.UiComponents

import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Label
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp_01.R
import androidx.compose.ui.res.painterResource
import com.example.mycoffeeapp_01.ui.theme.LightBrown
import androidx.compose.material3.Label

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomNavBar() {

    // BottomNavItems
    val navItems = listOf(
        NavItems("Home", R.drawable.regular_outline_home),
        NavItems("Cart", R.drawable.regular_outline_bag),
        NavItems("Favourites", R.drawable.regular_outline_heart),
        NavItems("Profile", R.drawable.outline_account_circle_24)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, items ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(items.icon),
                        contentDescription = "Home"
                    )
                },
                label = { Text(text = items.title) },
                modifier = Modifier.size(30.dp),
                onClick = { /*TODO*/ },
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedTextColor = Color.DarkGray,
                    unselectedIconColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.03f)

                )
            )

        }
    }


}


data class NavItems(
    val title: String,
    val icon: Int
)
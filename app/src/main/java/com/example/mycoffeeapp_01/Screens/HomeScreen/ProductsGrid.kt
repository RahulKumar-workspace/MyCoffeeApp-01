package com.example.mycoffeeapp_01.Screens.HomeScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp_01.Model.Product

@Composable
fun ProductsGrid(
    products: List<Product>
) {

    LazyRow(
        modifier = Modifier
//            .fillMaxSize()
            .fillMaxWidth()
            .height(420.dp)
            .padding(8.dp)
    ) {
        items(products.chunked(2)) { rowItems->

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                ProductCard(
                    product = rowItems[0],
                    modifier = Modifier.weight(1f)
                )

                if (rowItems.size == 2){
                    ProductCard(
                        product = rowItems[1],
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

        }


    }

}
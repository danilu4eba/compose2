package com.example.compose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image1, "asa"),
                        ItemRowModel(R.drawable.image2, "asasds"),
                        ItemRowModel(R.drawable.image3, "sdlkka"),
                        ItemRowModel(R.drawable.image4, "nbnnb"),
                        ItemRowModel(R.drawable.image5, "m,mhj"),
                        ItemRowModel(R.drawable.image6, "wqqwq"),

                    )
                ) {_ , item ->
                    ItemRow(item = item)


                }

            }
        }
    }
}


package com.example.a0341scaffoldincompose.Scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun scaffold(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Test") },
                colors = TopAppBarDefaults.largeTopAppBarColors(Color.Green),

                )
        },
        content = {
                innerPadding ->   Text(
            text = "Body content",
            modifier = Modifier
                .padding(innerPadding) //.fillMaxSize().wrapContentSize()


        )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {

            }
        }

    )
}
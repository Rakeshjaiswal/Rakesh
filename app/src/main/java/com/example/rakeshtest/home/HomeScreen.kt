package com.example.rakeshtest.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.rakeshtest.ui.JournalApp
import com.example.rakeshtest.ui.presentation.homeScreen.HomeViewModel
import com.example.rakeshtest.ui.theme.JournalTheme

@Composable
fun HomeScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Home Screen",  style = MaterialTheme.typography.headlineMedium)
//        Text(
//            text = "This place will soon have a design",
//            style = MaterialTheme.typography.bodyLarge
//        )


 //   val viewModel = ViewModelProvider()[HomeViewModel::class.java]
    JournalTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {
            JournalApp()
        }
    }
    }
//}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
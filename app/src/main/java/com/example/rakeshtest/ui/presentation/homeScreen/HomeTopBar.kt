package com.example.rakeshtest.ui.presentation.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.jpsampledrawer.R

@Composable
fun HomeTopBar(
    navigateToAboutScreen:()-> Unit
) {
    CenterAlignedTopAppBar(
        title = {
            Text(stringResource(R.string.Create_Note),
                fontFamily = FontFamily(Font(R.font.playfair_display_regular)),
            )
        },
//        navigationIcon = {
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = "logo",
//                modifier = Modifier
//                    .width(100.dp)
//                    .height(100.dp)
//            )
//        },
//        actions = {
//            IconButton(onClick = {navigateToAboutScreen() }) {
//                Icon(painterResource(
//                    id = R.drawable.baseline_delete_24),
//                    contentDescription = "Delete All Todo")
//            }
//        }
    )
}
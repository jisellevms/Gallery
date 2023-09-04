package com.jisellemartins.gallery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jisellemartins.gallery.App
import com.jisellemartins.gallery.viewmodel.GalleryViewModel
import kotlinx.coroutines.delay

@Composable
fun LoadingImages(galleryModelMain: GalleryViewModel) {
    val data by galleryModelMain.dataFlow.collectAsState()
    var loading by remember { mutableStateOf(true) }

    LaunchedEffect(loading) {
        delay(2500)
        loading = false
    }
    if (!loading) App(data)

    if (loading) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            CircularProgressIndicator(
                modifier = Modifier.width(60.dp),
                color = Color.Gray
            )
        }
    }
}
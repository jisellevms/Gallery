package com.jisellemartins.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jisellemartins.gallery.model.Data
import com.jisellemartins.gallery.ui.components.LoadingImages
import com.jisellemartins.gallery.ui.screens.GalleryScreen
import com.jisellemartins.gallery.ui.theme.GalleryTheme
import com.jisellemartins.gallery.viewmodel.GalleryViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    val galleryModelMain: GalleryViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoadingImages(galleryModelMain)
            galleryModelMain.getImagesList()
        }
    }
}

@Composable
fun App(data: Data) {
    GalleryTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GalleryScreen(data)

        }
    }
}


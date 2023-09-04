package com.jisellemartins.gallery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.gallery.model.Data
import com.jisellemartins.gallery.ui.components.ImageItem

@Composable
fun GalleryScreen(data: Data) {
    if (data.data.isNotEmpty()) ImagesGrid(data = data)
    else NotShowImage()
}

@Composable
fun ImagesGrid(data: Data) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(data.data) { image ->
            image.images.forEach {link ->
                ImageItem(link, image.title)
            }

        }
    }
}

@Composable
fun NotShowImage() {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Não foi possível exibir o conteúdo")
    }
}


@Preview
@Composable
fun showGallery() {

}
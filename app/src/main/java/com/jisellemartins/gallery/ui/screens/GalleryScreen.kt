package com.jisellemartins.gallery.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.gallery.model.Data
import com.jisellemartins.gallery.ui.components.ImageItem

@Composable
fun GalleryScreen(data: Data) {
    ImagesGrid(data = data)
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


@Preview
@Composable
fun showGallery() {

}
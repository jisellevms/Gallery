package com.jisellemartins.gallery.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jisellemartins.gallery.model.Links

@Composable
fun ImageItem(image: Links, title: String) {

    if (image.link.contains(".mp4")) {
        VideoShow(image.link)
    } else {
        AsyncImage(
            model = image.link,
            contentDescription = title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
    }

}
package com.jisellemartins.gallery.repositories

import com.jisellemartins.gallery.model.Data
import com.jisellemartins.gallery.service.GalleryService

class GalleryRepository constructor(
    private val service: GalleryService
) {

    suspend fun getImages(): Data {
        val response = service.getImages()

        if (response.isSuccessful) {
            return response.body() ?: Data(emptyList(), false, (-1.0).toFloat())
        }
        return Data(emptyList(), false, (-1.0).toFloat())

    }


}
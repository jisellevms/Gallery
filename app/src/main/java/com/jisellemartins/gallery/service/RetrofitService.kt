package com.jisellemartins.gallery.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object service {
    val api
        get() = Retrofit.Builder()
            .baseUrl("https://api.imgur.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    val galleryService = api.create(GalleryService::class.java)
}
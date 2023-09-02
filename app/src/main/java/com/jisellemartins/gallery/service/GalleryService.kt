package com.jisellemartins.gallery.service

import com.jisellemartins.gallery.model.Data
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface GalleryService {
    @Headers("Authorization: Client-ID 1ceddedc03a5d71")
    @GET("3/gallery/search/?q=cats")
    suspend fun getImages(): Response<Data>
}
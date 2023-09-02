package com.jisellemartins.gallery.di

import com.jisellemartins.gallery.repositories.GalleryRepository
import com.jisellemartins.gallery.service.GalleryService
import com.jisellemartins.gallery.service.service
import com.jisellemartins.gallery.viewmodel.GalleryViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val moduleGlobal = module {
    single<Retrofit> { service.api }
    single<GalleryService> { get<Retrofit>().create(GalleryService::class.java)}
    single<GalleryRepository> { GalleryRepository(get()) }
    viewModel<GalleryViewModel>{ GalleryViewModel(get())}
}
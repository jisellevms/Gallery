package com.jisellemartins.gallery

import android.app.Application
import com.jisellemartins.gallery.di.moduleGlobal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext

class GalleryAplication : Application(){
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidLogger()
            androidContext(this@GalleryAplication)
            modules(moduleGlobal)
        }
    }
}
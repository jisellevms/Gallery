package com.jisellemartins.gallery.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jisellemartins.gallery.model.Data
import com.jisellemartins.gallery.repositories.GalleryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GalleryViewModel(private val repository: GalleryRepository) : ViewModel() {
    private val _data = MutableStateFlow<Data>(Data(emptyList(), false, (-1.0).toFloat()))
    val dataFlow: StateFlow<Data> get() = _data

    fun getImagesList() {
        viewModelScope.launch {
            _data.value = repository.getImages()
        }
    }

}
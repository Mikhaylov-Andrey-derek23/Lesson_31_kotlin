package com.example.lesson_31

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val list:List<String>): ViewModel() {
    var textLiveData: MutableLiveData<String> =MutableLiveData()

    fun changeText(){
        textLiveData.value = "${list.random()} by Andrew"
    }
}
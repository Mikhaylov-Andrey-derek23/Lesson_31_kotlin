package com.example.lesson_31

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(): ViewModel() {
    var countLiveData: MutableLiveData<Int> =MutableLiveData(0)

    fun plusCount(){
        countLiveData.value  = countLiveData.value?.plus(1)
    }


}
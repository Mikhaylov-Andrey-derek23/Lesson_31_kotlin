package com.example.lesson_31

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val count:Int): ViewModel() {
    var countLiveData: MutableLiveData<Int> =MutableLiveData(count)

    fun plusCount(){
        countLiveData.value  = countLiveData.value?.plus(1)
    }

    fun minusCount(){
        countLiveData.value  = countLiveData.value?.plus(-1)
    }


}
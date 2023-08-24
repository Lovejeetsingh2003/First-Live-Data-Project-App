package com.lovejeet.livedataapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
    //livedata
    //mutable livedata

    var color : MutableLiveData<Int> = MutableLiveData(0)
    var number : MutableLiveData<Int> = MutableLiveData(1)
}
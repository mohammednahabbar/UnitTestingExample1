package com.biosteam99.unittestingexample1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CircleViewModel(private val circleCalculationImplement: CircleCalculationImplement): ViewModel() {

    var radius=MutableLiveData<String>()

    private var areaCircle=MutableLiveData<String>()
    val areaValue : LiveData<String>
    get() = areaCircle

    private var circumferenceCircle=MutableLiveData<String>()
    val circumferenceValue:LiveData<String>
    get() = circumferenceCircle


}
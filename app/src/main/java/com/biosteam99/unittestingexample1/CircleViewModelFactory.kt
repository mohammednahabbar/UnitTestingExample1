package com.biosteam99.unittestingexample1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CircleViewModelFactory(private val circleCalculationImplement: CircleCalculationImplement) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CircleViewModel(circleCalculationImplement) as T
    }
}
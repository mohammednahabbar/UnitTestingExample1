package com.biosteam99.unittestingexample1

class CircleCalculationImplement : Calculations {

    private val PI : Double=3.14

    override fun areaCircleCalculate(radius: Double): Double {
        return 2 * radius * radius
    }

    override fun circumferenceCircleCalculate(radius: Double): Double {
        return 2 * PI * radius
    }

}
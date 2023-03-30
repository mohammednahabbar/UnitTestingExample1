package com.biosteam99.unittestingexample1

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.biosteam99.unittestingexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG:String="MAINTAG"
    private lateinit var binding :ActivityMainBinding
    private lateinit var viewModel:CircleViewModel
    private lateinit var viewModelFactory: CircleViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModelFactory= CircleViewModelFactory(CircleCalculationImplement())
        viewModel=ViewModelProvider(this, viewModelFactory).get(CircleViewModel::class.java)
        binding.viewModel=viewModel
        binding.lifecycleOwner=this




        binding.btnCalculate.setOnClickListener {
            viewModel.radius.observe(this,{
                viewModel.circumferenceValueCalculate(it.toDouble())
                viewModel.areaValueCalculate(it.toDouble())
            })
        }



    }
}
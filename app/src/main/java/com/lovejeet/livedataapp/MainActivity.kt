package com.lovejeet.livedataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.lovejeet.livedataapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var liveDataViewModel: LiveDataViewModel
    lateinit var binding: ActivityMainBinding
    var number = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        liveDataViewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]
        binding.btnRed.setOnClickListener {
            liveDataViewModel.color.value = 1
        }
        binding.btnBlue.setOnClickListener {
            liveDataViewModel.color.value = 2
        }
        binding.btnGreen.setOnClickListener {
            liveDataViewModel.color.value = 3
        }
        binding.btnPlus.setOnClickListener {
            number += 1
            liveDataViewModel.number.value =number
        }
        binding.btnMinus.setOnClickListener {
            number -= 1
            liveDataViewModel.number.value =number
        }
        binding.btnClear.setOnClickListener {
            number =0
            liveDataViewModel.number.value =number
        }
    }
}
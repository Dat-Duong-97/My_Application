package com.example.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var TAG = "MainViewModel"
    fun printFunc() {
        Log.d(TAG, "printFunc")
    }
}
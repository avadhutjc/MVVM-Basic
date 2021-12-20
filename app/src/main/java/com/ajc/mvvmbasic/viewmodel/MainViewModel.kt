package com.ajc.mvvmbasic.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ajc.mvvmbasic.repo.MyRepository

class MainViewModel {

    val repository = MyRepository()

    fun getDataFromRepository(): LiveData<String> {
        val mutableLiveData = MutableLiveData<String>()
        mutableLiveData.value = repository.getDataFromRoom()
        return mutableLiveData
    }

}
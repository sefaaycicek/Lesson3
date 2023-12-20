package com.sirketismi.lesson3.features.newproduct

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddProductViewModel : ViewModel() {
    val code = MutableLiveData<String>()
    val name = MutableLiveData<String>()
    val description = MutableLiveData<String>()

    val errorDescription = MutableLiveData<String>()

    val newProductCallback = MutableLiveData<Boolean>()

    fun onNewProductInserted() {
        if(code.value.isNullOrEmpty() || name.value.isNullOrEmpty() || description.value.isNullOrEmpty()) {
            errorDescription.postValue("Lütfen tüm bilgileri eksiksiz doldurun")
            return
        }
        newProductCallback.postValue(true)
    }
}
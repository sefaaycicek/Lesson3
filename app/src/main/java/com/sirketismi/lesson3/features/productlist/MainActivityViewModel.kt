package com.sirketismi.lesson3.features.productlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var addProductObserver = MutableLiveData<Boolean>()
    fun onAddNewProduct() {
        addProductObserver.postValue(true)
    }
}
package com.sirketismi.lesson3.features.productlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sirketismi.lesson3.model.Product

class MainActivityViewModel : ViewModel() {
    private var productList = mutableListOf<Product>()
    var addProductObserver = MutableLiveData<Boolean>()
    fun onAddNewProduct() {
        addProductObserver.postValue(true)
    }

    fun addNewProduct(aProduct : Product) : Product? {
        if(aProduct.name.isEmpty()) {
            return null
        }

        productList.add(aProduct)
        return aProduct
    }
}
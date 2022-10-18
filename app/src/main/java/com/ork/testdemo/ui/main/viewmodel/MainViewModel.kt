package com.ork.testdemo.ui.main.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ork.testdemo.base.BaseViewModel
import com.ork.testdemo.data.model.Currency
import com.ork.testdemo.data.repository.MainRepository
import com.ork.testdemo.utils.NetworkHelper
import com.ork.testdemo.utils.Resource
import kotlinx.coroutines.launch


class MainViewModel(private val mainRepository: MainRepository,
                    private val networkHelper: NetworkHelper
):BaseViewModel() {

    private val _currency = MutableLiveData<Resource<List<Currency>>>()
    val currency: LiveData<Resource<List<Currency>>>
        get() = _currency

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _currency.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {
                    if (it.isSuccessful) {
                        _currency.postValue(Resource.success(it.body()))
                    } else _currency.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else _currency.postValue(Resource.error("No internet connection", null))
        }
    }
}
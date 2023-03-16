package com.sultonbek1547.roomwithcoroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sultonbek1547.roomwithcoroutines.db.SubscriberRepository

class SubscriberViewModelFactory(private val subscriberRepository: SubscriberRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)){
            return SubscriberViewModel(subscriberRepository) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel Class")
    }
}
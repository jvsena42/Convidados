package com.app.convidados.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.convidados.service.model.GuestModel
import com.app.convidados.service.repository.GuestRepository

class GuestsFormViewModel(application: Application): AndroidViewModel(application) {

    private val mcontext = application.applicationContext
    private val mGuestRepository: GuestRepository =GuestRepository.getInstance(mcontext)

    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name:String, presence:Boolean){
        val guest = GuestModel(name = name,presence =  presence)
        mGuestRepository.save(guest)
    }

}
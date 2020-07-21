package com.app.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.convidados.service.model.GuestModel
import com.app.convidados.service.repository.GuestRepository

class GuestsFormViewModel: ViewModel() {

    private val mGuestRepository: GuestRepository =
        GuestRepository()

    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGuest: LiveData<Boolean> = mSaveGuest

    fun save(name:String, presence:Boolean){
        val guest = GuestModel(name, presence)
        mGuestRepository.save(guest)
    }

}
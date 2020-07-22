package com.app.convidados.service.repository

import android.content.Context
import com.app.convidados.service.model.GuestModel

class GuestRepository private constructor(context:Context){

    /*criar um singleton
    * 1 fechar o construtor
    * 2 criar um objeto estático, porque uma classe dde construtor fechado não pode ser estática*/

    private var mGuestDataBaseHelper: GuestDataBaseHelper = GuestDataBaseHelper(context)

    companion object{

        private lateinit var repository: GuestRepository

        fun getInstance(context: Context) : GuestRepository{
            if (!::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    //CRUD - Create, Read, Update, Delete

    fun getAll(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresent(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent(): List<GuestModel>{
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun save(guest: GuestModel){

    }

    fun update(guest: GuestModel){

    }

    fun delete(guest: GuestModel){

    }


}
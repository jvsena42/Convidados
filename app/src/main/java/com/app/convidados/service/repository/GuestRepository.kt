package com.app.convidados.service.repository

import com.app.convidados.service.model.GuestModel

class GuestRepository{

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
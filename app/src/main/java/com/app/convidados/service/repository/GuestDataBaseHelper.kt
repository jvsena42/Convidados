package com.app.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.app.convidados.service.constants.DataBaseConstants

class GuestDataBaseHelper (context: Context) : SQLiteOpenHelper (context, DATABAE_NAME,null,DATABAE_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE_GUEST)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private const val DATABAE_VERSION = 1
        private const val DATABAE_NAME = "Convidados.db"

        private const val CREATE_TABLE_GUEST =
            ("create table" + DataBaseConstants.GUEST.TABLE_NAME + "("
                    + DataBaseConstants.GUEST.COLUMNS.ID + "integer primary key autoincrement,"
                    + DataBaseConstants.GUEST.COLUMNS.NAME + "text,"
                    + DataBaseConstants.GUEST.COLUMNS.PRESENCE + "integer);")

    }


}
package com.app.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.app.convidados.viewmodel.GuestsFormViewModel
import com.app.convidados.R
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mViewModel: GuestsFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestsFormViewModel::class.java)

        setListener()

    }

    private fun setListener(){
        button_save.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val id = v?.id
        if (id == R.id.button_save){

        }

    }
}
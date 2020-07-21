package com.app.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
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
        observe()
    }

    override fun onClick(v: View?) {

        val id = v?.id
        if (id == R.id.button_save){

            val name = edit_name.text.toString()
            val presence = radio_present.isChecked

            mViewModel.save(name,presence)
        }

    }

    private fun observe(){
        mViewModel.saveGuest.observe(this, Observer {
            if (it){
                Toast.makeText(applicationContext, "Sucesso!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Falha!", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setListener(){
        button_save.setOnClickListener(this)
    }
}
package com.example.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_antivity_nuev_usu.*
import kotlinx.android.synthetic.main.activity_frm_menu_principal.*

class antivity_nuev_usu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_antivity_nuev_usu)
        fcnCancelarNuevo()
    }

    fun fcnCancelarNuevo()
    {
        btnCancelar.setOnClickListener()
        {
            val CancelarNuevo = Intent(this,frmMenuPrincipal::class.java)
            startActivity(CancelarNuevo)
        }
    }
}
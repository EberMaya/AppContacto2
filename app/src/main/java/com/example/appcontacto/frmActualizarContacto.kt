package com.example.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_antivity_nuev_usu.*
import kotlinx.android.synthetic.main.activity_frm_actualizar_contacto.*

class frmActualizarContacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_actualizar_contacto)
        fcnCancelarNuevo()
    }

    fun fcnCancelarNuevo()
    {
        btnCancelarEdit.setOnClickListener()
        {
            val CancelarEdit = Intent(this,frmMenuPrincipal::class.java)
            startActivity(CancelarEdit)
        }
    }
}
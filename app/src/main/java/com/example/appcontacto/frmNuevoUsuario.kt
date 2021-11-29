package com.example.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_nuevo_usuario.*
import kotlinx.android.synthetic.main.*

class frmNuevoUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_nuevo_usuario)
        CancelarRegistro()
    }

    fun CancelarRegistro()
    {
        btnCancelarUsuario.setOnClickListener()
        {
            val CancelarUsuario = Intent(this,MainActivity::class.java)
            startActivity(CancelarUsuario)
        }
    }
}
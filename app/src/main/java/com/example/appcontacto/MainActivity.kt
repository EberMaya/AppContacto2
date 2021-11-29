package com.example.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_nuevo_usuario.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AbrirRegistro()
        CrearNuevoUsuario()

    }

    fun AbrirRegistro()
    {
        btnIngresar.setOnClickListener()
        {
            val AbrirRegistro = Intent(this,frmMenuPrincipal::class.java)
            startActivity(AbrirRegistro)
        }
    }

    fun CrearNuevoUsuario()
    {
        btnNuevoUsuario.setOnClickListener()
        {
            val NuevoUsuario = Intent(this,frmNuevoUsuario::class.java)
            startActivity(NuevoUsuario)
        }
    }
}
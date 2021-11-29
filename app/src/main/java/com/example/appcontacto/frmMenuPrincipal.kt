package com.example.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_frm_menu_principal.*
import kotlinx.android.synthetic.main.activity_main.*

class frmMenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_menu_principal)
        fcnNuevoContacto()
    }

    fun fcnNuevoContacto()
    {
        btnNuevoContacto.setOnClickListener()
        {
            val NuevoContacto = Intent(this,antivity_nuev_usu::class.java)
            startActivity(NuevoContacto)
        }
    }
}
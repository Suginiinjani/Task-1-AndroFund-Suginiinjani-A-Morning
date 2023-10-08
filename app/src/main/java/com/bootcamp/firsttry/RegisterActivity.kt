package com.bootcamp.firsttry

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etFullName: EditText
    private lateinit var etEmail: EditText
    private lateinit var  etUsernameReg: EditText
    private lateinit var  etPasswordReg: EditText
    private lateinit var etCfPassword: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etFullName = findViewById(R.id.edt_fullName)
        etEmail = findViewById(R.id.edt_email)
        etUsernameReg = findViewById(R.id.edt_usernameReg)
        etPasswordReg = findViewById(R.id.edt_passwordReg)
        etCfPassword = findViewById(R.id.edt_cfPassword)

        val btnRegister : Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register -> {
                val bundle = Bundle()
                bundle.putString("fullName", etFullName.text.toString())
                bundle.putString("email", etEmail.text.toString())
                bundle.putString("username", etUsernameReg.text.toString())
                bundle.putString("password", etPasswordReg.text.toString())

                val moving = Intent(this@RegisterActivity, LoginActivity::class.java)

                moving.putExtras(bundle)
                startActivity(moving)
            }
        }
    }
}
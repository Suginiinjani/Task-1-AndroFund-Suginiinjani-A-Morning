package com.bootcamp.firsttry

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.ImplicitDirectBootViolation
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.homeText)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username \nPassword: $password"

        val btnImplicit : Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_implicit -> {
//                val message = "Halo Test"
//                val moving = Intent()
//                moving.action = Intent.ACTION_SEND
//                moving.putExtra(Intent.EXTRA_TEXT, message)
//                moving.type = "text/plain"
//                startActivity(moving)
                val moving = Intent()
                moving.putExtra("history", "Anda Sudah Pernah Login")
                setResult(RESULT_OK, moving)
                finish()
            }
        }
    }
}
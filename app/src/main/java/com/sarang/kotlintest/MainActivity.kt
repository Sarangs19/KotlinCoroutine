package com.sarang.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.time.Duration

class MainActivity : AppCompatActivity() {
    private lateinit var tv_name : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       tv_name = findViewById(R.id.tv_name)

        tv_name.setText("Hey")
        tv_name.text = "heyee"
        var  name = tv_name.text

        val et_name = findViewById<EditText>(R.id.et_name)
        et_name.setHint("Enter Name")

        val btn_save = findViewById<Button>(R.id.save)
        btn_save.setText("Save")
        btn_save.setOnClickListener(
            View.OnClickListener {
                if(et_name.text.toString().equals("")){
                    et_name.setError("Enter Name")
                    et_name.requestFocus()
                }
                else{
                    et_name.setText("")
                    Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()

                    val  intent  = Intent(applicationContext,HomeActivity::class.java)
                    startActivity(intent)
                }
            }
        )


    }
}
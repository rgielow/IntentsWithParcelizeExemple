package com.gielow.intentswithparcelable.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gielow.intentswithparcelable.R
import com.gielow.intentswithparcelable.model.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtonListener()
    }

    private fun setupButtonListener() {
        button_next_step.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(CONTACT_KEY, getDataFromScreen())
            startActivity(intent)
        }
    }

    private fun getDataFromScreen(): Contact {
        return Contact(
            edt_name.text.toString(),
            edt_age.text.toString().toInt(),
            edt_email.text.toString()
        )
    }

    companion object {
        private const val CONTACT_KEY = "CONTRACT_KEY"
    }
}
package com.gielow.intentswithparcelable.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gielow.intentswithparcelable.R
import com.gielow.intentswithparcelable.model.Contact
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private var contact: Contact? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        contact = intent.getParcelableExtra(CONTACT_KEY)
        showDataOnScreen(contact)
    }

    private fun showDataOnScreen(contact: Contact?) {
        tv_name.text = contact?.name
        tv_age.text = contact?.age.toString()
        tv_email.text = contact?.email
    }

    companion object {
        private const val CONTACT_KEY = "CONTRACT_KEY"
    }
}
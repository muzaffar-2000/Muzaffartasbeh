package com.example.muzaffartasbeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muzaffartasbeh.databinding.ActivityZikirlaruchunBinding

class zikirlaruchun : AppCompatActivity() {
    var a=0
    val idd by lazy { ActivityZikirlaruchunBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(idd.root)
        idd.button.setOnClickListener {
            a++
            idd.sanoq.text=a.toString()
        }
        idd.delet.setOnClickListener {
            a=0
            idd.sanoq.text = a.toString()

        }

    }
}
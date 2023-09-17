package com.example.muzaffartasbeh

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import com.example.muzaffartasbeh.databinding.ActivityTasbehUchunBinding

class TasbehUchun : AppCompatActivity() {

    val vaqti:Long= 1000
    private var a = 0
    var zikir1: String = "Subhan Alloh"
    var zikir2: String = "Alhamdulillah"
    var zikir3: String = "Allohu akbar"
    var sanoq =1
    var x=0
    val tasId by lazy { ActivityTasbehUchunBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        val vibratsiya=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        super.onCreate(savedInstanceState)
        setContentView(tasId.root)
        tasId.keyingi.setOnClickListener {
            x++
                a++
                if (a == 33) {
                    vibratsiya.vibrate(vaqti)
                    a = 0
                    sanoq++

                }
                when (sanoq) {
                    1 -> tasId.teks.text = zikir1
                    2 -> tasId.teks.text = zikir2
                    3 -> tasId.teks.text = zikir3
                }
            tasId.sanoq.text=a.toString()
            if (x==99){
                tasId.teks.text=zikir1
                x=0
                sanoq=1
            }
        }

    }

}
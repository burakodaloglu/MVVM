package com.burakkodaloglu.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.burakkodaloglu.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //dataBinding Kullanımı
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main)
        tasarim.mainActivityNesnesi = this
        //livedata
        viewModel.sonuc.observe(this, { s ->
            tasarim.hesaplamaSonucu = s
        })
    }
    //handler kullanimi & View Model kullanımı
    fun buttonToplamaTikla(alinansayi1:String,alinansayi2:String){
        viewModel.toplamaYap(alinansayi1,alinansayi2)

    }
    //handler kullanimi & View Model kullanımı
    fun buttonCarpmaTikla(alinansayi1:String,alinansayi2:String){

        viewModel.carpmaYap(alinansayi1,alinansayi2)

    }
}
//android:visibility="@{Integer.parseInt(hesaplamaSonucu) > 20 ? View : @color/teal_700}"
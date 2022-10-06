package com.burakkodaloglu.mvvm

import androidx.lifecycle.MutableLiveData

class MatematikRepository {
    //livedata
    var matematikselSonuc= MutableLiveData<String>()
    init {
        matematikselSonuc= MutableLiveData<String>("0")
    }
    fun matematikselSonucGetir():MutableLiveData<String>{
        return matematikselSonuc
    }

    fun toplamaYap(alinansayi1:String,alinansayi2:String){
        val sayi1=alinansayi1.toInt()
        val sayi2=alinansayi2.toInt()
        val toplam=sayi1+sayi2
        matematikselSonuc.value=toplam.toString()
    }
    fun carpmaYap(alinansayi1:String,alinansayi2:String){
        val sayi1=alinansayi1.toInt()
        val sayi2=alinansayi2.toInt()
        val carpma=sayi1*sayi2
        matematikselSonuc.value=carpma.toString()
    }
}
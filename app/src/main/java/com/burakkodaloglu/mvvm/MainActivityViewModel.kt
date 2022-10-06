package com.burakkodaloglu.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    //livedata
    var sonuc=MutableLiveData<String>()
    var mrepo=MatematikRepository()
    init {
        sonuc=mrepo.matematikselSonucGetir()
    }

    fun toplamaYap(alinansayi1:String,alinansayi2:String){
        mrepo.toplamaYap(alinansayi1,alinansayi2)
    }
    fun carpmaYap(alinansayi1:String,alinansayi2:String){
        mrepo.carpmaYap(alinansayi1,alinansayi2)
    }


}
package com.yasincakir.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yasincakir.kisileruygulamasi.R
import com.yasincakir.kisileruygulamasi.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)


        binding.buttonKaydet.setOnClickListener {

            var kisi_ad = binding.EditTextKisiAd.text.toString()
            var kisi_tel = binding.EditTextKisiTel.text.toString()
            kaydet(kisi_ad,kisi_tel)

        }


        return binding.root
    }
    fun kaydet(kisi_ad:String,kisi_tel:String){

        Log.e("Kisi Kaydet","$kisi_ad - $kisi_tel")
    }

}
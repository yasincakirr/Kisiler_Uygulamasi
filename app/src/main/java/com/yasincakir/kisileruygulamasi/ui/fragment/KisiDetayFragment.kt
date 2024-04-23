package com.yasincakir.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.yasincakir.kisileruygulamasi.R
import com.yasincakir.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import com.yasincakir.kisileruygulamasi.databinding.FragmentKisiKayitBinding
import kotlinx.android.synthetic.main.fragment_kisi_detay.*

class KisiDetayFragment : Fragment() {

    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        binding = FragmentKisiDetayBinding.inflate(inflater, container, false)


        val bundle:KisiDetayFragmentArgs by navArgs()

        val gelenKisi=bundle.kisi

        binding.editTextKisiAd.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)





        binding.buttonGuncelle.setOnClickListener {

            val kisi_ad = binding.editTextKisiAd.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)

            Snackbar.make(it,"Kişi Güncellendi", Snackbar.LENGTH_SHORT).show()
        }


        return binding.root
    }
    fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){

        Log.e("Kişi Guncelle","$kisi_id - $kisi_ad - $kisi_tel")

    }


}
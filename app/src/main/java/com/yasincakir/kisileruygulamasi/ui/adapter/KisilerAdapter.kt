package com.yasincakir.kisileruygulamasi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.yasincakir.kisileruygulamasi.data.entity.Kisiler
import com.yasincakir.kisileruygulamasi.databinding.CardTasarimiBinding
import com.yasincakir.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections

class KisilerAdapter(var mContext:Context , var kisilerListesi:List<Kisiler>):RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimiBinding) :RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {

        val binding =CardTasarimiBinding.inflate(LayoutInflater.from(mContext),parent,false)

        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi = kisilerListesi.get(position)
        val t = holder.tasarim

        t.textViewKisiAd.text = kisi.kisi_ad
        t.textViewKisiTel.text = kisi.kisi_tel

        t.cardViewSatir.setOnClickListener {

            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi=kisi)

            Navigation.findNavController(it).navigate(gecis)

        }


        t.imageViewSil.setOnClickListener {

            Snackbar.make(it,"${kisi.kisi_ad} silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){

                    sil(kisi.kisi_id)

                }.show()
        }


    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }

    fun sil(kisi_id:Int){

        Log.e("Silme",kisi_id.toString())
    }

}
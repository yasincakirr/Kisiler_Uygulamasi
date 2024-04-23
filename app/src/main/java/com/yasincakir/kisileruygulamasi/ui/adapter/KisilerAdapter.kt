package com.yasincakir.kisileruygulamasi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yasincakir.kisileruygulamasi.data.entity.Kisiler
import com.yasincakir.kisileruygulamasi.databinding.CardTasarimiBinding

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


    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }


}
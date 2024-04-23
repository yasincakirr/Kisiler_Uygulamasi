package com.yasincakir.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.yasincakir.kisileruygulamasi.R
import com.yasincakir.kisileruygulamasi.data.entity.Kisiler
import com.yasincakir.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.yasincakir.kisileruygulamasi.ui.adapter.KisilerAdapter

class AnasayfaFragment : Fragment() {

    private lateinit var binding :  FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.floatingActionButton.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)

        }


        binding.searcView.setOnQueryTextListener(object : android.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                TODO("Not yet implemented")
                //arama ikonu çıkacak bir tane ona tıkladıktan sonra gelen fonksiyon

                ara(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                TODO("Not yet implemented")
                //harf girdikçe veya sildikçe bize sonuç getiren fonksiyon

                ara(newText)
                return true
            }



        })






        binding.rv.layoutManager = LinearLayoutManager(requireContext())

        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"Yasin","111111")
        val k2 = Kisiler(2,"Sefa","222222")
        val k3 = Kisiler(3,"Dogukan","333333")

        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)

        val kisilerAdapter = KisilerAdapter(requireContext(),kisilerListesi)

        binding.rv.adapter = kisilerAdapter






        return binding.root
    }


    fun ara(arananKelime : String){
        Log.e("KişiAra",arananKelime)
    }

}
package com.muhammhassan.recyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.muhammhassan.recyclerviewproject.databinding.ItemListLayoutBinding

class DataAdapter(val list: List<Data>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    //mendefinisikan layout yang akan digunakan
    inner class DataViewHolder(val binding: ItemListLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        //menetapkan layout yang digunakan pada setiap item yang ditampilkan
        val binding =
            ItemListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int {
        //Mengembalikan jumlah data yang ditampilkan
        return list.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = list[position]
        with(holder) {
            binding.apply {
                //Menentukan nilai dari setiap komponen yang ditampilkan pada item
                tvJudul.text = item.judul
                tvDesc.text = item.desc
            }

            //Menambahkan aksi pada saat item ditekan
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, item.judul + "Ditekan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
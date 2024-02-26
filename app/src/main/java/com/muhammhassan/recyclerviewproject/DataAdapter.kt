package com.muhammhassan.recyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.muhammhassan.recyclerviewproject.databinding.ItemListLayoutBinding

class DataAdapter(val list: List<Data>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: ItemListLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding =
            ItemListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = list[position]
        with(holder) {
            binding.apply {
                tvJudul.text = item.judul
                tvDesc.text = item.desc
            }

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, item.judul + "Ditekan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
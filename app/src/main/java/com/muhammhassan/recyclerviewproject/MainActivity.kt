package com.muhammhassan.recyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammhassan.recyclerviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = Data.generate()
        val dataAdapter = DataAdapter(list)

        binding.rvList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)

            adapter =dataAdapter
        }
    }
}
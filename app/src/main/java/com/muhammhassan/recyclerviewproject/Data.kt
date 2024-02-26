package com.muhammhassan.recyclerviewproject

data class Data(
    val judul: String,
    val desc: String
){
    companion object{
        fun generate(): List<Data> {
            return listOf(
                Data("Judul 1", desc = "Desc 1"),
                Data("Judul 2", desc = "Desc 2"),
                Data("Judul 3", desc = "Desc 3"),
                Data("Judul 4", desc = "Desc 4"),
                Data("Judul 5", desc = "Desc 5"),
                Data("Judul 2", desc = "Desc 2"),
                Data("Judul 3", desc = "Desc 3"),
                Data("Judul 4", desc = "Desc 4"),
                Data("Judul 5", desc = "Desc 5"),
                Data("Judul 2", desc = "Desc 2"),
                Data("Judul 3", desc = "Desc 3"),
                Data("Judul 4", desc = "Desc 4"),
                Data("Judul 5", desc = "Desc 5"),
                Data("Judul 2", desc = "Desc 2"),
                Data("Judul 3", desc = "Desc 3"),
                Data("Judul 4", desc = "Desc 4"),
                Data("Judul 5", desc = "Desc 5"),
            )
        }
    }
}

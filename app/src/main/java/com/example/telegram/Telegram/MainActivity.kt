package com.example.telegram.Telegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram.R


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshData(data())
    }

    private fun data(): ArrayList<Model> {
        val list = ArrayList<Model>()
        list.add(Model(R.drawable.sea,"Bob","You are the best!!!", "3:04"))
        list.add(Model(R.drawable.human,"Elon Musk","best!!!", "3:23"))
        list.add(Model(R.drawable.lamp,"Jeff Bezos","HI", "3:06"))
        list.add(Model(R.drawable.sea,"Bob","You are the best!!!", "3:04"))
        list.add(Model(R.drawable.lamp,"Elon Musk","best!!!", "3:23"))
        list.add(Model(R.drawable.human,"Jeff Bezos","HI", "3:06"))
        list.add(Model(R.drawable.lamp,"Bob","You are the best!!!", "3:04"))
        list.add(Model(R.drawable.sea,"Elon Musk","best!!!", "3:23"))
        list.add(Model(R.drawable.human,"Jeff Bezos","HI", "3:06"))
        list.add(Model(R.drawable.lamp,"Bob","You are the best!!!", "3:04"))
        list.add(Model(R.drawable.human,"Elon Musk","best!!!", "3:23"))
        list.add(Model(R.drawable.sea,"Jeff Bezos","HI", "3:06"))
        list.add(Model(R.drawable.human,"Bob","You are the best!!!", "3:04"))
        list.add(Model(R.drawable.sea,"Elon Musk","best!!!", "3:23"))
        list.add(Model(R.drawable.lamp,"Jeff Bezos","HI", "3:06"))
        return list
    }

    private fun refreshData(data: ArrayList<Model>) {
        val adapter = Adapter(this,data)
        recyclerView.adapter = adapter
    }
}
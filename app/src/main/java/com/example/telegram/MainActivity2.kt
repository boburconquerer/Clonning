package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerViews)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshData(data())
    }



    private fun data(): ArrayList<User> {
        var list = ArrayList<User>()
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        list.add(User(R.drawable.sea,"Magnus","best"))
        return list
    }

    private fun refreshData(data: ArrayList<User>) {
        val adapter = Adapter(this, data)
        recyclerView.adapter=adapter
    }


}
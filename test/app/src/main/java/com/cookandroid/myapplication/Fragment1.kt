package com.cookandroid.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.frag1.*

class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag1, container, false)
        return view
    }

    override fun onViewCreated(){
        val lv = find(R.id.main_fragment) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listOf("car", "plane"))
        lv.adapter = adapter
    }}

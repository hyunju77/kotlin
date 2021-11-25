package com.cookandroid.edit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val list_item= arrayListOf(
            list_item("게시글1", "16", "20211126"),
            list_item("게시글2", "20", "20211014"),
            list_item("게시글3", "68", "20210925"),
            list_item("게시글4", "3", "20210925"),
            list_item("게시글5", "71", "20210924")
        )

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv.setHasFixedSize(true)
        rv.adapter = list_item_adapter(list_item)
    }
}

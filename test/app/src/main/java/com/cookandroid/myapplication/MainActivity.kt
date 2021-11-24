package com.cookandroid.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFrag(0)

        btn_fragment1.setOnClickListener {
            setFrag(0)
        }
        btn_fragment2.setOnClickListener {
            setFrag(1)
        }
        btn_fragment3.setOnClickListener {
            setFrag(2)
        }
        btn_fragment4.setOnClickListener {
            setFrag(3)
        }
        btn_fragment5.setOnClickListener {
            setFrag(4)
        }

    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum) {
            0 -> {
                ft.replace(R.id.main_fragment, Fragment1()).commit()
            }
            1-> {
                ft.replace(R.id.main_fragment, Fragment2()).commit()
            }
            2-> {
                ft.replace(R.id.main_fragment, Fragment3()).commit()
            }
            3-> {
                ft.replace(R.id.main_fragment, Fragment4()).commit()
            }
            4-> {
                ft.replace(R.id.main_fragment, Fragment5()).commit()
            }
        }

    }
}

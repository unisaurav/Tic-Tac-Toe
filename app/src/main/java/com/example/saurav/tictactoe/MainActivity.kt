package com.example.saurav.tictactoe

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView2.setOnClickListener {
            newstart()
        }
    }
    fun newstart(){
        var re= Intent(this,MainActivity::class.java)
        startActivity(re)
    }
    fun btnclick(view:View){
        if (check==0) {
            val selbtn = view as Button
            var cellid = 0;
            when (selbtn.id) {
                R.id.bt1 -> cellid = 1
                R.id.bt2 -> cellid = 2
                R.id.bt3 -> cellid = 3

                R.id.bt4 -> cellid = 4
                R.id.bt5 -> cellid = 5
                R.id.bt6 -> cellid = 6


                R.id.bt7 -> cellid = 7
                R.id.bt8 -> cellid = 8
                R.id.bt9 -> cellid = 9
            }
            playgame(cellid, selbtn)
            // Toast.makeText(this,"You clicked $cellid", Toast.LENGTH_SHORT).show()
        }
    }
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var draw=ArrayList<Int>()
    var activeplayer:Int=1
    fun playgame(cellid:Int,selbtn:Button){
        selbtn.isEnabled=false
        if(activeplayer==1){
            selbtn.text="x"
            selbtn.setBackgroundResource(R.color.MediumAquamarine)
            player1.add(cellid)
            draw.add(cellid)
            activeplayer=2
        }
        else{
            selbtn.text="o"
            selbtn.setBackgroundResource(R.color.ForestGreen)
            player2.add(cellid)
            activeplayer=1
            draw.add(cellid)
        }
        checkwinner()
    }
    var check=0
    fun checkwinner(){
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1
        }
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }

        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(7)&&player2.contains(4)&&player2.contains(1)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(5)&&player2.contains(2)&&player2.contains(8)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }

        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_SHORT).show()
            check=1

        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_SHORT).show()
            check=1
        }
        if(draw.contains(1)&&draw.contains(2)&&draw.contains(3)&&draw.contains(4)&&draw.contains(5)
                &&draw.contains(8)&&draw.contains(7)&&draw.contains(6)&&
                draw.contains(9)){
            Toast.makeText(this,"Draw ^_^",Toast.LENGTH_SHORT).show()
        }


    }

}

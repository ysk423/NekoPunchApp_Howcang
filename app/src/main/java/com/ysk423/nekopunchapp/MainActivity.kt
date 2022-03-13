package com.ysk423.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //onCreateの中は起動直後にやる処理
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var iv :ImageView=findViewById(R.id.iv)

        //条件分岐、押したとき、動かしたとき、話したとき
        when(event?.action){
            //処理
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02)
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03)
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.cat01)

        }


        return super.onTouchEvent(event)
    }

}
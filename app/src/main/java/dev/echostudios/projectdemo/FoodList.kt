package dev.echostudios.projectdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_food_list.*

class FoodList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)

        var btnNum = 1
        for (i in 1..12) {
            val button = Button(this)
            button.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            button.text = "I'm food item #$btnNum generated programmatically!"
            button.setOnClickListener {
                val intent = Intent(this,FoodItemDisplay::class.java)
                startActivity(intent)
            }
            btnNum++
            food_linear_layout.addView(button)
        }


    }
}

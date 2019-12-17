package dev.echostudios.projectdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kitchen_button.setOnClickListener {
            val intent = Intent(this,FoodList::class.java)
            startActivity(intent)
        }

        service_button.setOnClickListener {
            val intent = Intent(this,FoodList::class.java)
            startActivity(intent)
        }

        prep_button.setOnClickListener {
            val intent = Intent(this,FoodList::class.java)
            startActivity(intent)
        }
    }
}
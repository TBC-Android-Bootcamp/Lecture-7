package com.example.lecture7_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // array of images
    private val images = arrayOf(R.mipmap.image1, R.mipmap.image2, R.mipmap.image3, R.mipmap.image4, R.mipmap.image5, R.mipmap.image6, R.mipmap.image7, R.mipmap.image8)
    private lateinit var imageViews:Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    // init function
    private fun init(){
        imageViews = arrayOf(image1, image2, image3, image4)
        image1.setOnClickListener(this)
        image2.setOnClickListener(this)
        image3.setOnClickListener(this)
        image4.setOnClickListener(this)
    }

    // override function for click
    override fun onClick(view: View?){
        var imageView = view as ImageView
        imageView.setOnClickListener() {
            randomImageView().setImageResource(randomImage())
        }
    }

    // ასეთი სტილი მირჩევნია.
    private fun randomImageView(): ImageView {
        return imageViews[(imageViews.indices).random()]
    } //

    private fun randomImage(): Int {
        return images[(images.indices).random()]
    }
}

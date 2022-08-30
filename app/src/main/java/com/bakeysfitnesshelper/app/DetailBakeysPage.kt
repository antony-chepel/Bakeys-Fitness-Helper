package com.bakeysfitnesshelper.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bakeysfitnesshelper.app.adapterbekfit.BakeysAdapter
import com.bakeysfitnesshelper.app.databinding.ActivityDetailFitPageBinding

class DetailBakeysPage : AppCompatActivity() {
    private lateinit var binding : ActivityDetailFitPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFitPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ojgffefw()
    }

    private fun ojgffefw() = with(binding){
      val desc = intent.getStringExtra(BakeysAdapter.DESC)
      val title = intent.getStringExtra(BakeysAdapter.TITLE)


        tvFit.text = title.toString()
        textDesc.text = desc.toString()

        fbBack.setOnClickListener {
            finish()
        }
    }
}
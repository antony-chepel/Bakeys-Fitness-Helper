package com.bakeysfitnesshelper.app.adapterbekfit

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bakeysfitnesshelper.app.DetailBakeysPage
import com.bakeysfitnesshelper.app.bakeysdata.BakeysData
import com.bakeysfitnesshelper.app.databinding.FitnessItemBinding
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class BakeysAdapter(val listFitness : List<BakeysData>, val activity : AppCompatActivity) : RecyclerView.Adapter<BakeysAdapter.FitHolder>() {
    class FitHolder(val binding: FitnessItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun jwewfwef(item : BakeysData, activity : AppCompatActivity) = with(binding){

            Picasso.get().load(item.imgFit).centerCrop().resize(600,900)
                .into(mainFitImg,object : Callback{
                    override fun onSuccess() {
                        pFitBar.visibility = View.GONE
                    }

                    override fun onError(e: Exception?) {

                    }

                })
          owejwer.text = activity.getString(item.mainTitileFit)
          pmqwhwqqw.text = activity.getString(item.titleFit)
          jkjdfsddqwd.text = activity.getString(item.descFit)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitHolder {
        val bindFitnes = FitnessItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FitHolder(bindFitnes)

    }

    override fun onBindViewHolder(holder: FitHolder, position: Int) {
        holder.jwewfwef(listFitness[position],activity)
        holder.itemView.setOnClickListener {
            val i = Intent(activity, DetailBakeysPage::class.java).apply {
                putExtra(DESC, activity.getString(listFitness[position].descFit))
                putExtra(TITLE, activity.getString(listFitness[position].titleFit))
            }
            activity.startActivity(i)
        }
    }

    override fun getItemCount(): Int = listFitness.size

    companion object {
        const val DESC = "desc"
        const val TITLE = "title"
    }
}
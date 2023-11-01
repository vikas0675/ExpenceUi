package com.example.expense_ui.adapter_class

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_ui.databinding.SecondryRowBinding
import com.example.expense_ui.model_class.SecondaryModel

class RecyclerSecondaryAdapter (val context: Context, val arrData2 : ArrayList<SecondaryModel>) : RecyclerView.Adapter<RecyclerSecondaryAdapter.ViewHolder>() {


    class ViewHolder(val binding2nd: SecondryRowBinding) : RecyclerView.ViewHolder(binding2nd.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerSecondaryAdapter.ViewHolder {
        return ViewHolder(SecondryRowBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int {
        return arrData2.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding2nd){
            imgCat.setImageResource(arrData2[position].imgPath)
            txtName.text= arrData2[position].title
            txtDescription.text= arrData2[position].desc
            txtaAmt.text= arrData2[position].amt
            txtTotalAmt.text=arrData2[position].totalAmt


        }
    }

}

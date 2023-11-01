package com.example.expense_ui.adapter_class

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_ui.databinding.MainRowBinding
import com.example.expense_ui.model_class.MainModel


class RecyclerMainAdapter ( val context: Context , val arrData : ArrayList<MainModel>) : RecyclerView.Adapter<RecyclerMainAdapter.ViewHolder>() {

    class ViewHolder (val binding: MainRowBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MainRowBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun getItemCount(): Int {
        return arrData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtDate.text = arrData[position].date
        holder.binding.txtaAmt.text = arrData[position].amt
        holder.binding.recylerSecondryView.layoutManager = LinearLayoutManager(context)
        holder.binding.recylerSecondryView.adapter =RecyclerSecondaryAdapter(context, arrData[position].listSecondary)
    }

}
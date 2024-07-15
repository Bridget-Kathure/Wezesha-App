package com.akirachix.wezeshaapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.wezeshaapplication.databinding.CreditHistoryListItemBinding

class CreditAdapter(val creditList: List<Credit>):
    RecyclerView.Adapter<CreditViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditViewHolder {
        val binding = CreditHistoryListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CreditViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return creditList.size
    }

    override fun onBindViewHolder(holder: CreditViewHolder, position: Int) {
        val credit = creditList[position]
        holder.binding.tvDate1.text = credit.date1
        holder.binding.tvAmount1.text = credit.amount1
        holder.binding.tvAccountDFR.text = credit.account2

    }
}

class CreditViewHolder(var binding: CreditHistoryListItemBinding):
    RecyclerView.ViewHolder(binding.root){

    }


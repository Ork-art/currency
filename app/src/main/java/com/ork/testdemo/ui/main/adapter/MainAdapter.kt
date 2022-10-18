package com.ork.testdemo.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ork.testdemo.data.model.Currency
import com.ork.testdemo.databinding.ItemRowBinding

class MainAdapter(private val testItem: ArrayList<Currency>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(private val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(currency: Currency) {
            binding.name.text = currency.name
            binding.value.text = currency.value

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRowBinding.inflate(layoutInflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(testItem[position])
    }

    override fun getItemCount(): Int {
        return testItem.size
    }

    fun addData(list: List<Currency>) {
        testItem.addAll(list)
    }
}
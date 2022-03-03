package com.example.animalrand.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animalrand.databinding.ListItemBinding
import com.example.animalrand.model.data.AnimalListItem

class AnimalAdapter():RecyclerView.Adapter<AnimalAdapter.ItemViewHolder>() {
    private lateinit var binding: ListItemBinding
    private var items: List<AnimalListItem> = emptyList()

    init {
        setHasStableIds(true)
    }

    override fun getItemId(position: Int): Long {
        return items[position].id.toLong()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun update(items: List<AnimalListItem>){
        this.items = items
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: AnimalListItem){
            binding.item = item
        }
    }
}
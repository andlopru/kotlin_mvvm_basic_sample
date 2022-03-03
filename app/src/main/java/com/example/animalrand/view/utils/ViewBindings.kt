package com.example.animalrand.view.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.animalrand.model.data.AnimalListItem
import com.example.animalrand.view.adapters.AnimalAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("bind_item_data")
fun setRecyclerViewDataItems(recyclerView: RecyclerView, items: List<AnimalListItem>?) {

    recyclerView.adapter?.takeIf { _recyclerView ->
        _recyclerView is AnimalAdapter
    }?.let { _recycleViewNotNULL ->
        items?.takeIf {
            it.isNotEmpty()
        }?.let { _items ->
            (_recycleViewNotNULL as AnimalAdapter).apply {
                update(_items)
            }
        }
    }
}
@BindingAdapter("bind_image_url")
fun ImageView.setDownloadImage(imageUrl: String?) {

    imageUrl?.let {
        try {
            Picasso.get().load(imageUrl).fit().centerCrop()
//                .placeholder(R.drawable.store_placeholder)
//                .error(R.drawable.store_placeholder)
                .into(this)
        } catch (e: IllegalArgumentException) {
            println("IMAGE_FROM_SERVER - Exception Bad URL")
        }
    } ?: run {
        println("IMAGE_FROM_SERVER - Exception URL null/empty")
    }
}

@BindingAdapter("list_item_first_line")
fun TextView.itemFirstLn(item: AnimalListItem){
    this.text = "${item.animal_type} - ${item.name}"
}
package android.part3_chapter3

import android.part3_chapter3.databinding.ItemDetailBinding
import android.part3_chapter3.model.DetailItem
import androidx.recyclerview.widget.RecyclerView


class DetailViewHolder(private val binding: ItemDetailBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: DetailItem) {
        binding.item = item
    }
}
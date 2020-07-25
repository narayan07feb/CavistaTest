package com.cavistatest.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.cavistatest.model.AppBean

class SearchDiffUtils(val newList: MutableList<AppBean>, val oldList: MutableList<AppBean>) :
    DiffUtil.Callback() {
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition];
    }

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition];
    }

}
package com.mredrock.cyxbs.discover.pages.morefunction

import android.content.Context
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

interface Bindable {
    fun onBindViewHolder(holder: MoreFunctionRvAdapter.MoreFunctionViewHolder, position: Int,adapter:MoreFunctionRvAdapter)
    fun setMoreFunctionIcon(imageView: ImageView)
    fun settingClicked(adapter: MoreFunctionRvAdapter,context:Context,imageView: ImageView)
}
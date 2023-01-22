package com.ersubhadip.devblogs.data.local.localDTO

import androidx.annotation.Keep

@Keep
data class LocalBlogModel(
    val id: String,
    val url: String,
    val title: String,
    val description: String,
    val tags: List<String>
)
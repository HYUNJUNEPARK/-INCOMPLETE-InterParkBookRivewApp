package com.example.bookreviewapp.model

import com.google.gson.annotations.SerializedName

data class SearchBookDto(
    @SerializedName("title") val title : String,
    @SerializedName("item") val bookDetails : List<BookDetailDto>
)

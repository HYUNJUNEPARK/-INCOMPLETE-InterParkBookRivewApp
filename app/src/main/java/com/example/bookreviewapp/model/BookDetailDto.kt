package com.example.bookreviewapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookDetailDto(
    @SerializedName("itemId") val id : Long,
    @SerializedName("title") val title : String,
    @SerializedName("description") val description : String,
    @SerializedName("coverSmallUrl") val coverSmallUrl : String
) : Parcelable

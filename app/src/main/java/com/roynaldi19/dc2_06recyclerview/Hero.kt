package com.roynaldi19.dc2_06recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: Int
) : Parcelable
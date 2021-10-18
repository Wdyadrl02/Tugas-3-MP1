package com.widyadarlina.ringshop.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val harga : String,
    val merek : String,
): Parcelable
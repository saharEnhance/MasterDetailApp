package com.example.masterdetailapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (val title: String, val year:String) : Parcelable
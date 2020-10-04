package com.gielow.intentswithparcelable.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Contact(
    val name: String?,
    val age: Int,
    val email: String?
) : Parcelable
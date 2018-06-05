package org.ja_nigeria.janigeria.model

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Instructor (var name: String, var post: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(post)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Instructor> {
        override fun createFromParcel(parcel: Parcel): Instructor {
            return Instructor(parcel)
        }

        override fun newArray(size: Int): Array<Instructor?> {
            return arrayOfNulls(size)
        }
    }
}
package org.ja_nigeria.janigeria.model

import android.os.Parcel
import android.os.Parcelable

class ModuleContent (var title: String, var type: Int, var status: Int, var content: String): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeInt(type)
        parcel.writeInt(status)
        parcel.writeString(content)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModuleContent> {
        override fun createFromParcel(parcel: Parcel): ModuleContent {
            return ModuleContent(parcel)
        }

        override fun newArray(size: Int): Array<ModuleContent?> {
            return arrayOfNulls(size)
        }
    }
}
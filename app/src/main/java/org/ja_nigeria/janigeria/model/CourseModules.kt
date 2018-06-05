package org.ja_nigeria.janigeria.model

import android.os.Parcel
import android.os.Parcelable

class CourseModules (var heading: String, var moduleContents: List<ModuleContent>): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.createTypedArrayList(ModuleContent)) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(heading)
        parcel.writeTypedList(moduleContents)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CourseModules> {
        override fun createFromParcel(parcel: Parcel): CourseModules {
            return CourseModules(parcel)
        }

        override fun newArray(size: Int): Array<CourseModules?> {
            return arrayOfNulls(size)
        }
    }
}
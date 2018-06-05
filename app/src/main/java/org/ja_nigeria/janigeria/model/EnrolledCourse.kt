package org.ja_nigeria.janigeria.model

import android.os.Parcel
import android.os.Parcelable

class EnrolledCourse (var title: String, var instructors: List<Instructor>, var modules: List<CourseModules>) :
        Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.createTypedArrayList(Instructor),
            parcel.createTypedArrayList(CourseModules)) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeTypedList(instructors)
        parcel.writeTypedList(modules)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EnrolledCourse> {
        override fun createFromParcel(parcel: Parcel): EnrolledCourse {
            return EnrolledCourse(parcel)
        }

        override fun newArray(size: Int): Array<EnrolledCourse?> {
            return arrayOfNulls(size)
        }
    }
}
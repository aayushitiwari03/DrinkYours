package com.example.drinkyours

import android.os.Parcel
import android.os.Parcelable

//class User {
//}


data class HomeUser(var id: Int, var name: String, var tagline:String, var first_brewed:String,
                    var description:String, var image_url:String, var abv:Int, var ibu:Int, var target_fg:Int,
                    var target_og:Int, var ebc:Int, var srm:Int, var ph:Int, var attenuation_level:Int ) :
    Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(tagline)
        parcel.writeString(first_brewed)
        parcel.writeString(description)
        parcel.writeString(image_url)
        parcel.writeInt(abv)
        parcel.writeInt(ibu)
        parcel.writeInt(target_fg)
        parcel.writeInt(target_og)
        parcel.writeInt(ebc)
        parcel.writeInt(srm)
        parcel.writeInt(ph)
        parcel.writeInt(attenuation_level)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HomeUser> {
        override fun createFromParcel(parcel: Parcel): HomeUser {
            return HomeUser(parcel)
        }

        override fun newArray(size: Int): Array<HomeUser?> {
            return arrayOfNulls(size)
        }
    }
}
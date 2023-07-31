package com.kotlinseries.notetakingapp.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "notes")
@Parcelize
//But we need to add the personalized annotation so this personalized annotation will tell an Android
//and Android studio and the Kotlin compiler to generate a write to parcel and describe content
//methods as well as creator factory class automatically.
//So despite writing these methods, we're going to use the personalized annotation in order to get rid
// of these methods and overwrite them here automatically.
data class Note(
    @PrimaryKey
val id:Int,
val notetitle:String,
val notebody:String
//below
//Passable is an interface that a class can implement to be passed within an instant from an activity
//to another one.
//This way, transporting data from one activity to another one by default by Parcelable will will need
// to override two functions.
//The describe contents function and write to parcel.

):Parcelable{
   // override fun describeContents(): Int {
   //     TODO("Not yet implemented")
  //  }

   // override fun writeToParcel(dest: Parcel, flags: Int) {
    //    TODO("Not yet implemented")
   // }
}

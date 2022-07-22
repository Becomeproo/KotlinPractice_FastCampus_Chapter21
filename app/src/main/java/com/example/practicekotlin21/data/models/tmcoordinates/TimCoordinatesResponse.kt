package com.example.practicekotlin21.data.models.tmcoordinates


import com.google.gson.annotations.SerializedName

data class TimCoordinatesResponse(
    @SerializedName("documents")
    val documents: List<Document?>?,
    @SerializedName("meta")
    val meta: Meta?
)
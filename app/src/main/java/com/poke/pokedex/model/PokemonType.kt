package com.poke.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokemonType(
    @SerializedName("type")
    val type: TypeName
)
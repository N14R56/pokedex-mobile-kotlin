package com.poke.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeResponse(
    @SerializedName("results")
    val pokemons: List<Pokemon>
)

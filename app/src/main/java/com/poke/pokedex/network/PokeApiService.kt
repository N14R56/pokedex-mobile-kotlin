package com.poke.pokedex.network

import com.poke.pokedex.model.PokeResponse
import com.poke.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiService {

    @GET("pokemon?limit=151")
    fun getPokemons() : Call<PokeResponse>

    @GET("pokemon/{id}")
    fun getPokemonById(@Path("id") id:String) : Call<Pokemon>

    @GET("pokemon/{pokemonName}")
    fun getPokemonByName(@Path("pokemonName") pokemon:String) : Call<Pokemon>
}
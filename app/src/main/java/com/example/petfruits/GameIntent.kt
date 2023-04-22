package com.example.petfruits

sealed class GameIntent{
    object LogIn : GameIntent()
    object Map : GameIntent()
    object Game : GameIntent()
    data class GameState(val itemId : Int) : GameIntent()
}

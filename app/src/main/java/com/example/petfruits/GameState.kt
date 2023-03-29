package com.example.petfruits

data class GameState(
    val isLoading: Boolean,
    val data: List<Integer>,
    val error: Throwable?
)

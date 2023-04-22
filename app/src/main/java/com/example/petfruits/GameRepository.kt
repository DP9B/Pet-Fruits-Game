package com.example.petfruits

import com.example.petfruits.Game

class GameRepository {
    fun getAllData():List<GameInformation>{
        return listOf(
            GameInformation(
                Id = 0,
                GameName = "Snack"
            ),
            GameInformation(
                Id = 1,
                GameName = "Snack1"
            ),
            GameInformation(
                Id = 2,
                GameName = "Snack2"
            ),
            GameInformation(
                Id = 3,
                GameName = "Snack3"
            ),
            GameInformation(
                Id = 4,
                GameName = "Snack4"
            ),
            GameInformation(
                Id = 5,
                GameName = "Snack5"
            ),
            GameInformation(
                Id = 6,
                GameName = "Snack6"
            ),
            GameInformation(
                Id = 7,
                GameName = "Snack7"
            ),
            GameInformation(
                Id = 8,
                GameName = "Snack8"
            ),
            GameInformation(
                Id = 9,
                GameName = "Snack9"
            )
        )
    }
}
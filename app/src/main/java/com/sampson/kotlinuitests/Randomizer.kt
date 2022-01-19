package com.sampson.kotlinuitests

import java.util.*

class Randomizer(private val random: Random) {
    fun getTimeToWait(): Int {
        return random.nextInt(5) + 1
    }

}
package com.sampson.kotlinuitests

import java.util.*

class TestRandomizer(random: Random) : Randomizer(random) {

    override fun getTimeToWait(): Int{
        return 1
    }
}
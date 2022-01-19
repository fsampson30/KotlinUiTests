package com.sampson.kotlinuitests

import java.util.*

class TestMyApplication : MyApplication() {

    override fun createRandomizer(): Randomizer {
        return TestRandomizer(Random())
    }
}
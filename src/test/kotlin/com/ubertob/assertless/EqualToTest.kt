package com.ubertob.assertless

import `==`
import org.junit.jupiter.api.Test

class EqualToTest {

    @Test
    fun `many ways to skin a cat`(){
        4 `==` 2*2

        val hello = "hello"

        hello `==` "hello"
    }

}
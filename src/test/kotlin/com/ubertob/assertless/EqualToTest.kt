package com.ubertob.assertless

import `==`
import org.junit.jupiter.api.Test
import org.opentest4j.AssertionFailedError

class EqualToTest {

    @Test
    fun `many ways to skin a cat`(){
        4 `==` 2*2

        val hello = "hello"

        hello `==` "hello"
    }


    @Test
    fun `expect to fail`(){

        try {
            4 `==` 5
        }catch (e: Throwable){
           e::class.java `==` AssertionFailedError::class.java

           e.message.orEmpty() `==` "Comparison failed"
        }
    }

}
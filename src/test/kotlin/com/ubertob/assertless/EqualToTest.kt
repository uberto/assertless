package com.ubertob.assertless

import `!=`
import `==`
import org.junit.jupiter.api.Test
import org.opentest4j.AssertionFailedError

class EqualToTest {

    val hello = "hello"

    data class Person(val name: String, val age: Int)
    val fred = Person("Fred", 25)
    val anne = Person("Anne", 32)

    @Test
    fun `is equal to`(){
        4 `==` 2*2

        hello `==` "hello"

        fred `==` Person("Fred", 25)
    }

    @Test
    fun `is not equal to`(){
        4 `!=` 5

        hello `!=` "good bye"

        anne `!=` fred
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
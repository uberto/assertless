package com.ubertob.assertless

import org.opentest4j.AssertionFailedError


infix fun Any.`in`(expected: Collection<Any?>): Unit =
        if (this in expected) {
            //all ok
        } else {
            throw AssertionFailedError("Comparison failed", expected, this)
        }


infix fun Any.`!in`(expected: Collection<Any?>): Unit =
    if (this in expected) {
        throw AssertionFailedError("Comparison failed", expected, this)
    } else {
        //all ok
    }


infix fun String.`in`(expected: String?): Unit =
    if (this in expected.orEmpty()) {
        //all ok
    } else {
        throw AssertionFailedError("Comparison failed", expected, this)
    }


infix fun String.`!in`(expected: String?): Unit =
    if (this in expected.orEmpty()) {
        throw AssertionFailedError("Comparison failed", expected, this)
    } else {
        //all ok
    }


//TODO  `>=` `<=` `regex
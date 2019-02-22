
import org.opentest4j.AssertionFailedError

infix fun Any.`==`(expected: Any?): Unit = when(this) {
    expected -> Unit
    else -> throw AssertionFailedError("Comparison failed", expected, this)
}

infix fun Any.`≡`(expected: Any?): Unit = this `==` expected

infix fun Any.同 (expected: Any?): Unit = this `==` expected
# assertless

Free your unit tests from assert this and assert that.

Works with any xUnit framework in Kotlin.


# Example of use

```    val hello = "hello"
   
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
```

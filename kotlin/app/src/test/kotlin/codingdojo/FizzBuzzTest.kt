package codingdojo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `should return Fizz when given number is a multiple of three`() {
        val answer: String = FizzBuzz.reply(9)
        assertEquals("Fizz", answer)
    }

    @Test
    fun `should return Buzz when a given number is multiple of five`() {
        val answer: String = FizzBuzz.reply(10)
        assertEquals("Buzz", answer)
    }

    @Test
    fun `should return FizzBuzz when a given number is multiple of three and five`() {
        val answer: String = FizzBuzz.reply(15)
        assertEquals("FizzBuzz", answer)
    }

    @Test
    fun `should return the number when the given is neither multiple of three nor five`() {
        val answer: String = FizzBuzz.reply(8)
        assertEquals("8", answer)
    }

}
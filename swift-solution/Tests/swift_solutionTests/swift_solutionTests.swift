import Testing
@testable import swift_solution

@Suite("FizzBuzz tests") struct LeapYearTests {

    @Test func should_return_Fizz_given_9() {
        let answer = FizzBuzz.reply(number: 9)

        #expect(answer == "Fizz", "should return Fizz given 9" )

    }

    @Test func should_return_Buzz_given_25() {
        let answer = FizzBuzz.reply(number: 25)

        #expect(answer == "Buzz", "should return Buzz given 25")
    }

    @Test func should_return_FizzBuzz_given_15() {
        let answer = FizzBuzz.reply(number: 15)

        #expect(answer == "FizzBuzz", "should return FizzBuzz given 15")
    }

    @Test func should_return_8_given_8() {
        let answer = FizzBuzz.reply(number: 8)

        #expect(answer == "8", "should return 8 given 8")
    }
}
